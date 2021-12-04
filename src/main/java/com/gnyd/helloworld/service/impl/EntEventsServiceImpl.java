package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.EntEvents;
import com.gnyd.helloworld.mapper.EntEventsMapper;
import com.gnyd.helloworld.service.EntEventsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Service
public class EntEventsServiceImpl extends ServiceImpl<EntEventsMapper, EntEvents> implements EntEventsService {

}
