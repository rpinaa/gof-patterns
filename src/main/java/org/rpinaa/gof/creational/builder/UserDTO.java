package org.rpinaa.gof.creational.builder;

import lombok.Getter;

@Getter
public class UserDTO {

    private String firstName;
    private String lastName;
    private String age;
    private String address;

    public static class Builder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;

        public Builder withFirstName(final String firstName) {
            this.firstName = firstName;

            return this;
        }

        public Builder withLastName(final String lastName) {
            this.lastName = lastName;

            return this;
        }

        public Builder withAge(final String age) {
            this.age = age;

            return this;
        }

        public Builder withAddress(final String address) {
            this.address = address;

            return this;
        }

        public UserDTO build() {

            final UserDTO userDTO = new UserDTO();

            userDTO.age = this.age;
            userDTO.address = this.address;
            userDTO.lastName = this.lastName;
            userDTO.firstName = this.firstName;

            return userDTO;
        }
    }
}
