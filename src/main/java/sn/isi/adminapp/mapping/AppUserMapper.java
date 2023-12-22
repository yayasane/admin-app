package sn.isi.adminapp.mapping;

import org.mapstruct.Mapper;
import sn.isi.adminapp.dto.AppUser;
import sn.isi.adminapp.entities.AppUserEntity;

@Mapper
public interface AppUserMapper {
    AppUser toAppUser(AppUserEntity appUserEntity);
    AppUserEntity fromAppUser(AppUser appUser);
}
