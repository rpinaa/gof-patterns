package org.rpinaa.gof.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class UserDTOBuilderTest {

    @Test
    public void builder_afterASimpleBuildMethod_shouldReturnAnUserDTOEmptyInstance() {

        final UserDTO userDTO = new UserDTO.Builder().build();

        Assert.assertNotNull(userDTO);
        Assert.assertNull(userDTO.getAge());
        Assert.assertNull(userDTO.getAddress());
        Assert.assertNull(userDTO.getLastName());
        Assert.assertNull(userDTO.getFirstName());

    }

    @Test
    public void builder_afterACompleteBuildMethod_shouldReturnAnUserDTOInstanceWithAllNotNullAttributes() {

        final UserDTO userDTO = new UserDTO.Builder()
                .withAddress("Monumento a la Raza 25")
                .withAge("29")
                .withFirstName("Ricardo Pina")
                .withLastName("Arellano")
                .build();

        Assert.assertNotNull(userDTO);
        Assert.assertNotNull(userDTO.getAge());
        Assert.assertNotNull(userDTO.getAddress());
        Assert.assertNotNull(userDTO.getLastName());
        Assert.assertNotNull(userDTO.getFirstName());
    }
}
