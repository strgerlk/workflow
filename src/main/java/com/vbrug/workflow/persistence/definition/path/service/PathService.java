package com.vbrug.workflow.persistence.definition.path.service;

import com.vbrug.workflow.persistence.definition.path.mapper.PathMapper;
import com.vbrug.workflow.persistence.definition.path.po.PathPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 节点路径查询Service
 *
 * @author vbrug
 * @since 1.0.0
 */
@Service("pathService")
public class PathService {

    @Resource
    private PathMapper mapper;

    /**
     * 查询节点路径
     *
     * @param processId 流程ID
     * @param fromNode 出发节点
     * @param toNode 目标节点
     * @return 路径List
     */
    public List<PathPO> queryPath(Integer processId, Integer fromNode, Integer toNode){
        return mapper.queryPath(processId, fromNode, toNode);
    }

}
