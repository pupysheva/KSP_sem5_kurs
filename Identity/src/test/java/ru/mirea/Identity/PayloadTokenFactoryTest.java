package ru.mirea.Identity;

import org.junit.Test;
import ru.mirea.IdentityService.Engine.PayloadToken;
import ru.mirea.IdentityService.Engine.Role;

import java.util.Collections;

public class PayloadTokenFactoryTest {
    @Test
    public void SaveAndLoadPayload() {
        PayloadToken payloadToken = new PayloadToken(2, "pup", Collections.singletonList(Role.ADMIN));
        assertEquals("{\"id\":2,\"login\":\"pup\",\"role\":[\"ADMIN\"]}", payloadToken.generateJSON());
    }
}