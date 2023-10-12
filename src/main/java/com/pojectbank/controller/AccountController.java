package com.pojectbank.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping
public class AccountController {

//    @RestController
//@RequestMapping("account")
//@RequiredArgsConstructor
//public class AccountController {
//    private final AccountService accountService;
//    private final AccountMapper accountMapper;
//
//    @GetMapping("/get/{id}")
//    public AccountDto getAccount(@PathVariable("id") String id){
//        Optional<UserAccount> opt = accountService.findById(id);
//
//        if (opt.isPresent()){
//            return accountMapper.accountToDto(opt.get());
//        }
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//    }
}
