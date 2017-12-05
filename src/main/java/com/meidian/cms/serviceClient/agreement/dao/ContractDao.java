package com.meidian.cms.serviceClient.agreement.dao;

import com.meidian.cms.serviceClient.agreement.Contract;
import com.meidian.cms.serviceClient.car.CarInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Title: com.meidian.cms.serviceClient.agreement.dao<br>
 * Description: <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author 张中凯
 *         2017/12/2
 */
public interface ContractDao extends CrudRepository<Contract,Long>, JpaSpecificationExecutor<Contract> {

    /**
     * 根据人员id获取合同信息
     * @param userId
     * @param isDeleted
     * @return
     */
    List<Contract> getContractByUserIdAndIsDeleted(Long userId, Integer isDeleted);

    /**
     * 根据车辆id获取合同信息
     * @param carId
     * @param isDeleted
     * @return
     */
    List<Contract> getContractByCarIdAndIsDeleted(Long carId, Integer isDeleted);
}