package com.company.examples;



public class InterfaceExample {
    interface Rule {
        public boolean rulePasses(int number);
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

    public boolean isThree(int number) {
        Rule[] rules = new Rule[] {
                new lessThanThreeRule(),
                new GreaterThanThreeRule()
        };
        for(int i = 0; i < rules.length; i ++) {
            if(!rules[i].rulePasses(number)) {
                return false;
            }
        }
        return true;
    }
}

