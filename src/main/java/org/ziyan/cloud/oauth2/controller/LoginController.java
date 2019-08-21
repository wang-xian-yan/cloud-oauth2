package org.ziyan.cloud.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangxian
 * @date 2019/8/21 18:17
 */
@Controller
public class LoginController {
    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }
}
