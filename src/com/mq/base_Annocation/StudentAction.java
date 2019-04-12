package com.mq.base_Annocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class StudentAction {
    @Autowired
    private StudentDao studentDao;

    private StudentService studentService;

    @Autowired
    @Qualifier("studentServiceImpl")
    public void setStudentService(StudentService studentService)
    {
        this.studentService=studentService;
    }

    public void execute()
    {
        System.out.println("StudentAction");
        studentDao.save();
        studentService.show();
    }
}
