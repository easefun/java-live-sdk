package com.polyv.live.bean.request;

import com.polyv.live.util.JsonUtil;

/**
 * <pre>
 *  请求体基础对象对象
 * </pre>
 *
 * @author HuangYF
 */
public class PLBaseBody {

    public String toJson() {
        return JsonUtil.toJSONString(this);
    }

}