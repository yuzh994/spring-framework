package com.yuzh.app;

import com.yuzh.deferredImportSelector.YuzhDeferredImportSelector;
import com.yuzh.deferredImportSelector.YuzhSelectImport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(YuzhDeferredImportSelector.class)
public class ImportConfig {
}
