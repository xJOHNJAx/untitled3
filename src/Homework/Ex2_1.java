package Homework;

public class Ex2_1 {
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    static class AnotherCustomException extends Exception {
        public AnotherCustomException(String message) {
            super(message);
        }
    }

    static class BaseClass {
        public void processValue(int value) throws CustomException {
            if (value < 0) {
                throw new CustomException("Значение не может быть отрицательным");
            }
        }
    }

//    class DerivedClass extends BaseClass {
//        @Override
//        public void processValue(int value) throws AnotherCustomException {
//            if (value > 100) {
//                throw new AnotherCustomException("Значение не может быть больше 100");
//            }
//
//            try {
//                super.processValue(value);
//            } catch (CustomException e) {
//
//            }
//       }
    }

