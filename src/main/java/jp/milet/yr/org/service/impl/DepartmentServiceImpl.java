package jp.milet.yr.org.service.impl;

import jp.milet.yr.basic.service.impl.BasicServiceImpl;
import jp.milet.yr.org.domain.Department;
import jp.milet.yr.org.mapper.DepartmentMapper;
import jp.milet.yr.org.query.DepartmentQuery;
import jp.milet.yr.org.service.IDepartmentService;
import jp.milet.yr.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/6 17:00
 */
@Service
public class DepartmentServiceImpl extends BasicServiceImpl<Department> implements IDepartmentService {


}
