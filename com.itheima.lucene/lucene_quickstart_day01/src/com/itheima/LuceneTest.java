package com.itheima;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.*;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.File;

public class LuceneTest {
    //创建索引
    @Test
    public void creatIndex() throws Exception{
        Document document = new Document();

        int i=0;
         //绑定 索引存放路径
        FSDirectory directory = FSDirectory.open(new File("D:\\temp\\index").toPath());
        IndexWriterConfig config = new IndexWriterConfig();
        IndexWriter indexWriter = new IndexWriter(directory,config);

         //获取文档
        File[] files = new File("D:\\temp\\searchsource").listFiles();
        for (File file : files) {
            String fileName = file.getName();//文件名
            String filePath = file.getPath();//路径
            long fileSize = FileUtils.sizeOf(file);//文件大小
            String fileContent = FileUtils.readFileToString(file,"utf-8");//文件内容

         //创建文档域对象
            Field fileNameField = new TextField("filename",fileName,Field.Store.YES);
            Field filePathField = new TextField("filepath",filePath, Field.Store.YES);
            Field fileSizeField = new TextField("filesize",fileSize+"", Field.Store.YES);
            Field fileContentField = new TextField("filecontent",fileContent, Field.Store.YES);
         //对文档对象赋值
            document.add(fileNameField);
            document.add(filePathField);
            document.add(fileSizeField);
            document.add(fileContentField);

         //将文档对象写入到索引库
            indexWriter.addDocument(document);
        }
        indexWriter.close();
    }

}
