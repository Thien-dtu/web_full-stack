package fa.youareright.service;

import fa.youareright.model.HairService;
import org.springframework.stereotype.Service;

import fa.youareright.dto.UpdateInfoDTO;
import fa.youareright.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

@Service
public interface UserService {

    String getLastUserId();


//    String getNextId(String inputId);


	String getNextId(String inputId);


    void saveNamNB6(User user);

    User findByAccountId(Integer accountId);

    void updateInfo(UpdateInfoDTO info);

    Page<User> listAll(String condition, Pageable pageable);

    void save(User user);

    User findByUserId(String userId);

    User findByEmpId(String employeeId);

    void updateStatus(String userId);


}
