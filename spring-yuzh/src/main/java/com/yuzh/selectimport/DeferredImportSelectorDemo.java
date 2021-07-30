package com.yuzh.selectimport;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class DeferredImportSelectorDemo implements DeferredImportSelector {


	/**
	 *返回一个 实现了 Group接口的类
	 * @return
	 */
	@Override
	public Class<? extends Group> getImportGroup() {
		return DeferredImportSelectorGroupDemo.class;
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("=================DeferredImportSelectorDemo.selectImports");
		return new String[]{SelectImportBean.class.getName()};
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
			return null;
		}
	}
}
