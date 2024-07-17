package com.example.test.service;

import com.example.test.model.Group;
import com.example.test.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> findByUserId(Long userId) {
        return groupRepository.findByUserId(userId);
    }

    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public void deleteById(Long groupId) {
        groupRepository.deleteById(groupId);
    }
}