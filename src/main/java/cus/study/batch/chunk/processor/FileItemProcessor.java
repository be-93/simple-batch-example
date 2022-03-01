package cus.study.batch.chunk.processor;

import cus.study.batch.domain.Product;
import cus.study.batch.domain.ProductVO;
import org.springframework.batch.item.ItemProcessor;

public class FileItemProcessor implements ItemProcessor<ProductVO, Product> {

    @Override
    public Product process(ProductVO item) throws Exception {
        return null;
    }
}
