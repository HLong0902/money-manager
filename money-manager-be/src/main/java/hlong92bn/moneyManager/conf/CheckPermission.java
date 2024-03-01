//package hlong92bn.moneyManager.conf;
//
//
//import hlong92bn.moneyManager.model.entity.User;
//import hlong92bn.moneyManager.repo.UserRepo;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class CheckPermission {
//    @Autowired
//    private UserRepo userRepo;
//
//    @Around("@execution(hlong92bn.moneyManager.endPoint.*.*(..))")
//    public Object checkPermission(ProceedingJoinPoint joinPoint) throws Throwable {
//        String auth = joinPoint.get;
//        User user = userRepo.getUserByAuth(auth);
//
//        return joinPoint.proceed();
//    }
//
//}
