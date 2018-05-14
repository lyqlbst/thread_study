package thread._2_concurrency._2_synchronized_code_blocks_part._13__1_inner_class_and_static._1_inner_class;

class PublicClass {
    private String userName;
    private String password;

    class PrivateClass {
        private String age;
        private String address;

        void printPublicProperty() {
            System.out.println(userName + " " + password);
        }

        String getAge() {
            return age;
        }

        void setAge(String age) {
            this.age = age;
        }

        String getAddress() {
            return address;
        }

        void setAddress(String address) {
            this.address = address;
        }
    }

    String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
