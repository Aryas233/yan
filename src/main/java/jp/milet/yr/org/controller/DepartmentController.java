package jp.milet.yr.org.controller;

import jp.milet.yr.org.domain.Department;
import jp.milet.yr.org.query.DepartmentQuery;
import jp.milet.yr.org.service.IDepartmentService;
import jp.milet.yr.util.AjaxResult;
import jp.milet.yr.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/6 18:00
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @PutMapping
    public AjaxResult save(@RequestBody Department department) {
        try {
            // 判断结束搜的数据是否包含id
            if (department.getId() == null) {
                // 如果没有id，添加
                departmentService.add(department);
            } else {
                departmentService.update(department);
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
            departmentService.delete(id);
            return AjaxResult.me();
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除失败").setSuccess(false);
        }
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id) {
        try {
            return departmentService.findById(id);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping
    public List<Department> findAll() {
        try {
            return departmentService.findAll();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /**
     * description 高级查询
     *
     * @param departmentQuery
     * @return jp.milet.yr.util.PageResult
     * @author yan
     * @date 2021/8/10 11:12:42
     * @version 1.0
     */
    @PostMapping
    public PageResult queryPage(@RequestBody DepartmentQuery departmentQuery) {
        try {
            return departmentService.queryPage(departmentQuery);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /**
     * description 批量删除
     *
     * @param ids
     * @return jp.milet.yr.util.AjaxResult
     * @author yan
     * @date 2021/8/10 11:12:31
     * @version 1.0
     */
    @PatchMapping
    public AjaxResult batchDelete(@RequestBody Long[] ids) {
        try {
            // 直接调用批量删除方法
            departmentService.batchDelete(ids);
            return AjaxResult.me();
        } catch (Exception e){
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除失败").setSuccess(false);
        }
    }
}
