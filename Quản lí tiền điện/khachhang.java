����   4 X  opp/khachhang  java/lang/Object hoten Ljava/lang/String; sonha I socongto <init> ()V Code
   
  LineNumberTable LocalVariableTable this Lopp/khachhang; (Ljava/lang/String;II)V	    	    	   	  nhaptt  java/util/Scanner	     java/lang/System ! " in Ljava/io/InputStream;
  $ 
 % (Ljava/io/InputStream;)V	  ' ( ) out Ljava/io/PrintStream; + nhap ho ten khach hang: 
 - / . java/io/PrintStream 0 1 println (Ljava/lang/String;)V
  3 4 5 nextLine ()Ljava/lang/String; 7 nhap so nha khach hang: 
 9 ; : java/lang/Integer < = parseInt (Ljava/lang/String;)I ? nhap so cong to khach hang:  Ljava/util/Scanner; hienttt C java/lang/StringBuilder E ho ten ho dan: 
 B G 
 1
 B I J K append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 B M N 5 toString P 	so nha : 
 B R J S (I)Ljava/lang/StringBuilder; U 
so cong to 
SourceFile khachhang.java !                 	      
      3     *� �       
    	  
              
      l     *� *+� *� *� �              	         *                        	          �     B� Y� � #L� &*� ,*+� 2� � &6� ,*+� 2� 8� � &>� ,*+� 2� 8� �       "           #  .  6  A         B      7 ! @   A      �     L� &� BYD� F*� � H� L� ,� &� BYO� F*� � Q� L� ,� &� BYT� F*� � Q� L� ,�              2  K          L      V    W