package sn.isi.adminapp.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import sn.isi.adminapp.dto.AppRoles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class AppRolesServiceTest {

    @Autowired
    private AppRolesService appRolesService;
    @BeforeEach
    void setUp() {
        log.info("On setup");
    }

    @AfterEach
    void tearDown() {
        log.info("All tests runned");
    }

    @Test
    void getAppRoles() {
        List<AppRoles> appRolesList =
                appRolesService.getAppRoles();

        assertEquals(1, appRolesList.size());
    }

    @Test
    void getAppRole() {
        AppRoles appRoles = appRolesService.getAppRole(1);

        assertNotNull(appRoles);
    }

    @Test
    void createAppRoles() {

        AppRoles appRoles = new AppRoles();
        appRoles.setNom("ROLE_USER");

        AppRoles appRolesSave = appRolesService.createAppRoles(appRoles);

        assertNotNull(appRolesSave);
        //Assertions.assertEquals(appRoles.getNom(), appRolesSave.getNom());
    }

    @Test
    void updateAppRoles() {
        AppRoles appRoles = new AppRoles();
        appRoles.setNom("ROLE_TECH");

        AppRoles appRolesSave = appRolesService.updateAppRoles(1, appRoles);

        assertEquals("ROLE_TECH", appRolesSave.getNom());

    }

    @Test
    void deleteAppRoles() {

        appRolesService.deleteAppRoles(1);
        Assertions.assertTrue(true);
    }

    @Test
    void operation() {
        int val1 = 1;
        int val2 = 2;
        int val3 = val1 + val2;
        assertEquals(3, val3);
    }
}