package com.jhao.serviceImpl;


import com.jhao.pojo.Person;
import com.jhao.service.QueryService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements QueryService {

    @Override
    public Person getOnePerson(String s) {
        Person person = new Person();
        person.setName(s+randomString());
        return person;
    }

    public String randomString(){
        String str="";

        for(int i=0;i<4;i++){

            char c=(char)(0x4e00+(int) (Math.random()*(0x9fa5-0x4e00+1)));

            str+=c;
        }

        return str;
    }


}
