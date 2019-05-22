package io.prong.uid.service;

import io.prong.uid.UidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 预先缓存UID的生成器服务
 *
 * @author tangyz
 */
@Service
public class UidGenService {

    @Autowired
    private UidGenerator cachedUidGenerator;

    @Autowired
    private UidGenerator defaultUidGenerator;


    public long getCachedUid() {
        return cachedUidGenerator.getUID();
    }

    public long getDefaultUid() {
        return defaultUidGenerator.getUID();
    }
}
