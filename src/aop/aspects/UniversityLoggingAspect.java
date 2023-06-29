package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//   @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//       System.out.println("afterThrowingGetStudentsLoggingAdvice: logging throwing report - " + exception);
//   }

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsAdvice(){
//        System.out.println("beforeGetStudentsAdvice: logging report before - getStudents");
//    }
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsAdvice: logging report afterReturning - getStudents");
//    }

//    @After("execution(* getStudents())")
//    public void afterGetStudentLoggingAdvice(){
//        System.out.println("afterGetStudentLoggingAdvice: log report normal or error");
//    }


}
