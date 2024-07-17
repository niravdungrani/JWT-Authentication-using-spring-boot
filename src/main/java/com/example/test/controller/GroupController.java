package com.example.test.controller;

import com.example.test.model.Group;
import com.example.test.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/user/{userId}")
    public List<Group> getGroupsByUserId(@PathVariable Long userId) {
        return groupService.findByUserId(userId);
    }

    @PostMapping
    public Group addGroup(@RequestBody Group group) {
        return groupService.save(group);
    }

    @PutMapping("/{groupId}")
    public Group editGroup(@PathVariable Long groupId, @RequestBody Group group) {
        group.setId(groupId);
        return groupService.save(group);
    }

    @DeleteMapping("/{groupId}")
    public void deleteGroup(@PathVariable Long groupId) {
        groupService.deleteById(groupId);
    }
}