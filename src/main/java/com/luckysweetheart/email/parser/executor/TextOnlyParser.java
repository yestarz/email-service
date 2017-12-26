package com.luckysweetheart.email.parser.executor;

import com.luckysweetheart.email.parser.parsers.TextParser;

/**
 * 纯文本解析。传递什么返回什么，不做任何解析。
 * Created by yangxin on 2017/12/26.
 */
public class TextOnlyParser implements TextParser {

    @Override
    public String parse(String content) {
        return content ;
    }
}