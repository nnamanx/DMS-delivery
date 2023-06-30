package com.nnamanx.deliverymanagementsystem.service.Impl;

import com.nnamanx.deliverymanagementsystem.dto.request.UserRequest;
import com.nnamanx.deliverymanagementsystem.dto.response.ResponseDto;
import com.nnamanx.deliverymanagementsystem.dto.response.UserResponse;
import com.nnamanx.deliverymanagementsystem.enums.ResponseMessage;
import com.nnamanx.deliverymanagementsystem.exception.UserNotFoundException;
import com.nnamanx.deliverymanagementsystem.model.Email;
import com.nnamanx.deliverymanagementsystem.model.entity.MyUser;
import com.nnamanx.deliverymanagementsystem.repository.UserDao;
import com.nnamanx.deliverymanagementsystem.service.EmailService;
import com.nnamanx.deliverymanagementsystem.service.UserService;
import com.nnamanx.deliverymanagementsystem.utils.Utils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final EmailService emailService;
    private final ModelMapper modelMapper;


    @Override
    public List<UserResponse> findAllUsers() {
        return (List<UserResponse>) userDao.findAll().stream()
                .map(product -> modelMapper.map(product, UserResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse findUserById(Long id) throws Throwable {
        return modelMapper.map(userDao.findById(id)
                .orElseThrow(UserNotFoundException::new), UserResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateUser(UserRequest userRequest) {
        userDao.save(modelMapper.map(userRequest, User.class));
        return ResponseEntity.ok(new ResponseDto(ResponseMessage.UPDATE_SUCCESSFULLY.name()));
    }


    @Override
    public ResponseEntity<String> signUp(Map<Email, Email> requestMap) {
        log.info("Inside signup {}", requestMap);


        try {
            if (ValidateSignUpMap(requestMap)) {
                MyUser user = userDao.findByEmail(requestMap.get("email"));
                if (Objects.isNull(user)) {
                    userDao.save(getUserFromMap(requestMap));
                    return Utils.getResponseEntity(String.valueOf(ResponseMessage.SUCCESSFULLY_REGISTERED), HttpStatus.OK);
                } else {
                    return Utils.getResponseEntity(ResponseMessage.EMAIL_ALREADY_EXISTS.name(), HttpStatus.BAD_REQUEST); //400
                }
            } else {
                return Utils.getResponseEntity(String.valueOf(ResponseMessage.INVALID_DATA), HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Utils.getResponseEntity(ResponseMessage.SOMETHING_WENT_WRONG.name(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public void sendPasswordResetEmail(Email email) {
        MyUser user = userDao.findByEmail(email);
        if (user != null) {

            // Generate password reset token and save it in the user entity

            String resetToken = generateResetToken();
            user.setResetToken(resetToken);
            userDao.save(user);

            // Sending password reset email
            String resetLink = generateResetLink(resetToken);

            email.setSubject("Password reset");
            email.setBody("Please click the link below to reset your password:\n" + resetLink);
            emailService.sendMail(email);
        }
    }

    private String generateResetToken() {
        // Generate and return a unique password reset token
        return null;
    }

    private String generateResetLink(String resetToken) {
        // Generate and return the password reset link based on the resetToken
        return null;
    }


    private boolean ValidateSignUpMap(Map<Email, Email> requestMap) {
        if (requestMap.containsKey("name") && requestMap.containsKey("phoneNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password")) {
            return true;
        } else return false;
    }

    private MyUser getUserFromMap(Map<Email, Email> requestMap) {
        MyUser user = new MyUser();
        user.setName(String.valueOf(requestMap.get("name")));
        user.setPhoneNumber(String.valueOf(requestMap.get("phoneNumber")));
        user.setEmail(String.valueOf(requestMap.get("email")));
        user.setPassword(String.valueOf(requestMap.get("password")));
        user.setStatus("false");
        return user;
    }


}
