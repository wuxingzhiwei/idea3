package service;

import bean.User;
import utils.BusinessException;

public interface UserService {
    public User register(User User) throws BusinessException;

}
