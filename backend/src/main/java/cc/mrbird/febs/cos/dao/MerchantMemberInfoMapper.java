package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.MerchantMemberInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * @author FanK
 */
public interface MerchantMemberInfoMapper extends BaseMapper<MerchantMemberInfo> {

    /**
     * 分页获取药店会员信息
     *
     * @param page        分页对象
     * @param merchantMemberInfo 药店会员信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectMerchantMemberPage(Page<MerchantMemberInfo> page, @Param("merchantMemberInfo") MerchantMemberInfo merchantMemberInfo);
}
