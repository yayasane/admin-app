package sn.isi.adminapp.mapping;

import org.mapstruct.Mapper;
import sn.isi.adminapp.dto.AppRoles;
import sn.isi.adminapp.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
