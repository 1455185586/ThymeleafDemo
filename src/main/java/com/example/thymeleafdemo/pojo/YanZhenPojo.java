package com.example.thymeleafdemo.pojo;

import org.hibernate.validator.constraints.Length;
//import com.sun.istack.internal.NotNull;
import lombok.Data;
//import sun.security.util.Length;


import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class YanZhenPojo implements Serializable {
    private Long id;
    @NotBlank(message="用户名不能为空")
    @Length(min=5,max=20,message="用户名长度为5-20个字符")
    private String name;

    @NotNull(message="年龄不能为空")
    @Min(value=18,message="最小18岁")
    @Max(value=60,message="最大60岁")
    private Integer age;

    @Email(message="请输入邮箱")
    @NotBlank(message="邮箱不能为空")
    private String email;

//    @MyCustomConstraint
//    private String answer;

}
