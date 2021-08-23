package com.yuzh.deferredImportSelector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class YuzhDeferredImportSelector implements DeferredImportSelector{

	/**
	 *返回一个 实现了 Group接口的类
	 * @return
	 */
	@Override
	public Class<? extends DeferredImportSelector.Group> getImportGroup() {
		return YuzhDeferredImportSelector.DeferredImportSelectorGroupDemo.class;
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("=================DeferredImportSelectorDemo.selectImports");
		return new String[]{YuzhSelectImport.class.getName()};
	}

	private static class DeferredImportSelectorGroupDemo implements DeferredImportSelector.Group{

		List<Entry> list = new ArrayList<>();
		/**
		 * 搜集需要实例化的类
		 * @param metadata
		 * @param selector
		 */
		@Override
		public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
			System.out.println("=================DeferredImportSelectorGroupDemo.process");
			String[] strings = selector.selectImports(metadata);
			for (String string : strings) {
				list.add(new Entry(metadata,string));
			}

		}

		@Override
		public Iterable<Entry> selectImports() {
			return list;
		}
	}
}
