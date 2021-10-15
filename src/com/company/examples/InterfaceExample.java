package com.company.examples;



public class InterfaceExample {

    interface Rule {
        public boolean rulePasses(int number);
    }
    abstract class AbstractTwo {
        public boolean rulePasses(int number) {
            return number != 0;
        }
    }
    class ClassTwo extends AbstractTwo {

    }
    class ClassNotZero extends AbstractTwo {
        @Override
        public boolean rulePasses(int number) {
            return number == 0;
        }

    }

    class lessThanThreeRule implements Rule {

        @Override
        public boolean rulePasses(int number) {
            if(number < 3) {
                return false;
            } else {
                return true;
            }
        }
    }
    class GreaterThanThreeRule implements Rule {

        @Override
        public boolean rulePasses(int number) {
            if(number > 3) {
                return false;
            } else {
                return true;
            }
        }
    }
    public boolean isTwo(int number) {
        ClassTwo newClassTwo = new ClassTwo();
        ClassNotZero newClassNotZero = new ClassNotZero();
        AbstractTwo[] classArray = new AbstractTwo[] { newClassTwo, newClassNotZero };
        for (int i = 0; i < classArray.length; i ++) {
            if(!classArray[i].rulePasses(number)) {
                return false;
            }
        }
        return true;
    }
//    public boolean isThree(int number) {
//        Rule[] rules = new Rule[] {
//                new lessThanThreeRule(),
//                new GreaterThanThreeRule()
//        };
//        for(int i = 0; i < rules.length; i ++) {
//            if(!rules[i].rulePasses(number)) {
//                return false;
//            }
//        }
//        return true;
//    }

}

