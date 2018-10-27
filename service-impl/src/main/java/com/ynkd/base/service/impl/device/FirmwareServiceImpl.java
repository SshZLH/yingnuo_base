package com.ynkd.base.service.impl.device;

import com.yingnuo.common.exception.CommonException;
import com.ynkd.base.model.device.Firmware;
import com.ynkd.base.model.device.FirmwareExample;
import com.ynkd.base.service.device.DeviceService;
import com.ynkd.base.service.device.FirmwareService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * author: shen
 * p _ p
 * Date:2018/10/27
 * Time:15:32
 */
@Service("firmwareService")
public class FirmwareServiceImpl implements FirmwareService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DeviceService.class);

    @Override
    public Firmware selPk(String id) throws CommonException {
        return null;
    }

    @Override
    public List<Firmware> selModelsByE(FirmwareExample example) throws CommonException {
        return null;
    }

    @Override
    public int insModel(Firmware record) throws CommonException {
        return 0;
    }

    @Override
    public int updModelByPk(Firmware record) throws CommonException {
        return 0;
    }

    @Override
    public int updModelByExample(Firmware record, FirmwareExample example) {
        return 0;
    }
}
