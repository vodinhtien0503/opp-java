����   4 T  opp/main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
Lopp/main; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   ,1. nhap thong tin cho n ho dan su dung dien.
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V ( (2. hien thi thong tin tat ca cac ho dan. * 3. thoat chuong trinh , nhap su lua chon cua ban: 
  . / 0 nextLine ()Ljava/lang/String;
 2 4 3 java/lang/Integer 5 6 parseInt (Ljava/lang/String;)I 8 (nhap khong hon le ,vui long kiem tra lai : nhap so luong ho dan < opp/bienlai
 ; 	
 ; ? @  nhaptt B thong tin ho dan : 
 ; D E  hienttt args [Ljava/lang/String; luachon I n 
danhsachhd [Lopp/bienlai; Ljava/util/Scanner; i StackMapTable G L 
SourceFile 	main.java !               /     *� �    
                    	      �     �N� Y� � :� � !� '� !� )� !� +� !� -� 1<� � � 7� !�    w            U   w� 9� !� -� 1=� ;N6� -� ;Y� =S-2� >�-���� %� A� !6� -2� C�-���� ��c�    
   f             &  .  7  A  I  d  l  u  z  �   � ! �  � # � & � ' � ( � ' � + � 1 � 3    H    � F G   7 � H I  u * J I   � K L   �  M  }  N I  �  N I  O   V 
� &  P   Q   �   P  Q   �   P Q   � 	  P  Q   � 	� 	  R    S