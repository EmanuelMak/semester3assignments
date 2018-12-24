import java.util.Iterator;

public class makeFileComposite {
    public static void main(String[] args) {
        Directory dir1 = new Directory("dir1","read and access but not writtable");
        Directory dir11 = new Directory("dir11");
        Directory dir12 = new Directory("dir12");
        Directory dir111 = new Directory("dir111");
        Directory dir112 = new Directory("dir112");
        Directory dir121 = new Directory("dir121");
        Directory dir122 = new Directory("dir122");
        Directory dir123 = new Directory("dir123");

        MyComponent d1 = new Composite<Directory,File>(dir1);
        MyComponent d11 = new Composite<Directory,File>(dir11);
        MyComponent d12 = new Composite<Directory,File>(dir12);
        MyComponent d111 = new Composite<Directory,File>(dir111);
        MyComponent d112 = new Composite<Directory,File>(dir112);
        MyComponent d121 = new Composite<Directory,File>(dir121);
        MyComponent d122 = new Composite<Directory,File>(dir122);
        MyComponent d123 = new Composite<Directory,File>(dir123);

        File file1InDir1 = new File("file1InDir1", "nottext","i want to tell you a story about a hous a rabbit and an blablablablbla");
        File file2InDir1 = new File("file2InDir1");
        File file1InDir12 = new File("file2InDir12");
        File file1InDir112 = new File("file1InDir112");
        File file2InDir112 = new File("file2InDir112");
        File file3InDir112 = new File("file3InDir112");
        File file1InDir122 = new File("file1InDir122");
        File file2InDir122 = new File("file2InDir122");
        File file1nDir123 = new File("file1InDir123");
        File file2InDir123 = new File("file2InDir123");
        File file3InDir123 = new File("file3InDir123");
        File file4InDir123 = new File("file4InDir123");
        File file5InDir123 = new File("file5InDir123");
        File file6inDir123 = new File("file6InDir123");
        Leaf <Directory,File>d1f1 = new Leaf<Directory,File>(file1InDir1);
        d1.add(d1f1);
        MyComponent d12f1 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d12f1);
        MyComponent d1f12 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d1f12);
        MyComponent d1f112 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d1f112);
        MyComponent d2f112 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d2f112);
        MyComponent d3f112 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d3f112);
        MyComponent d1f122 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d1f122);
        MyComponent d2f122 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d2f122);
        MyComponent d1f123 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d1f123);
        MyComponent d2f123 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d2f123);
        MyComponent d3f123 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d3f123);
        MyComponent d4f123 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d4f123);
        MyComponent d5f123 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d5f123);
        MyComponent d6f123 = new Leaf<Directory,File>(file1InDir1);
        d12.add(d6f123);
//
//        Directory dir1 = new Directory();
//        Directory dir11 = new Directory();
//        Directory dir12 = new Directory();
//        Directory dir111 = new Directory();
//        Directory dir112 = new Directory();
//        Directory dir121 = new Directory();
//        Directory dir122 = new Directory();
//        Directory dir123 = new Directory();
        d1.add(d11);
        d1.add(d12);
        d11.add(d111);
        d11.add(d112);
        d12.add(d121);
        d12.add(d122);
        d12.add(d123);
        System.out.println(d1.count());
        ((Composite) d1).printContent();

    }


}
