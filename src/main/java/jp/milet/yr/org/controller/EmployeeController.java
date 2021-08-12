package jp.milet.yr.org.controller;

import jp.milet.yr.org.domain.Employee;
import jp.milet.yr.org.query.EmployeeQuery;
import jp.milet.yr.org.service.IEmployeeService;
import jp.milet.yr.util.AjaxResult;
import jp.milet.yr.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @PutMapping
    public AjaxResult save(@RequestBody Employee employee) {
        try {
            // 判断接收的数据是否包含id
            if (employee.getId() == null) {
                // 如果没有id，添加
                employeeService.add(employee);
            } else {
                // 有id，则调用修改方法
                employeeService.update(employee);
            }
            return AjaxResult.me();
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setMessage("操作失败").setSuccess(false);
        }
    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            // 直接调用删除方法
            employeeService.delete(id);
            return AjaxResult.me();
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setMessage(e.getCause().toString()).setSuccess(false);
        }
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id) {
        try {
            return employeeService.findById(id);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping
    public List<Employee> findAll() {
        try {
            return employeeService.findAll();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /**
     * description 高級查詢和分页
     *
     * @param employeeQuery
     * @return jp.milet.yr.util.PageResult
     * @author yan
     * @date 2021/8/10 19:10:54
     * @version 1.0
     */
    @PostMapping
    public PageResult queryPage(@RequestBody EmployeeQuery employeeQuery){
        try {
            return employeeService.queryPage(employeeQuery);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @PatchMapping()
    public AjaxResult batchDelete(@RequestBody Long[] ids) {
        try {
            // 直接调用批量删除方法
            employeeService.batchDelete(ids);
            return AjaxResult.me();
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除失败").setSuccess(false);
        }
    }
    /**
     * description 删除带有角色信息的雇员
     *
     * @param id
     * @return jp.milet.yr.util.AjaxResult
     * @author yan
     * @date 2021/8/11 14:21:25
     * @version 1.0
     */
    @DeleteMapping("/specific/{id}")
    public AjaxResult deleteConnect(@PathVariable("id") Long id){
        try {
            // 直接调用删除方法
            employeeService.deleteConnect(id);
            return AjaxResult.me();
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setMessage(e.getCause().toString()).setSuccess(false);
        }
    }
}
