����   4 `  opp/sach  java/lang/Object tensach Ljava/lang/String; 	tentacgia namxb I <init> ()V Code
   
  LineNumberTable LocalVariableTable this 
Lopp/sach; ((Ljava/lang/String;Ljava/lang/String;I)V	    		    	     
getTensach ()Ljava/lang/String; 
setTensach (Ljava/lang/String;)V getTentacgia setTentacgia getNamxb ()I setNamxb (I)V nhap & java/util/Scanner	 ( * ) java/lang/System + , in Ljava/io/InputStream;
 % . 
 / (Ljava/io/InputStream;)V	 ( 1 2 3 out Ljava/io/PrintStream; 5 nhap ten sach: 
 7 9 8 java/io/PrintStream :  println
 % < =  nextLine ? nhap ten ten tac gia:  A nhap nam xuat ban: 
 C E D java/lang/Integer F G parseInt (Ljava/lang/String;)I Ljava/util/Scanner; hienthi K java/lang/StringBuilder M 
ten sach: 
 J O 
 
 J Q R S append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 J U V  toString X ten tac gia:  Z nam suat ban: 
 J \ R ] (I)Ljava/lang/StringBuilder; 
SourceFile 	sach.java !                  	   
  
      3     *� �       
    	  
              
      l     *� *� *+� *,� �              	         *                         	         /     *� �                               >     *+� �       
                                /     *� �                               >     *+� �       
                            !     /     *� �                          " #     >     *� �       
    #  $                 	   $      �     ?� %Y� '� -L� 04� 6*+� ;� � 0>� 6*+� ;� � 0@� 6*+� ;� B� �       "    &  '  (  ) # * + + 3 , > .        ?      4 + H   I      �     L� 0� JYL� N*� � P� T� 6� 0� JYW� N*� � P� T� 6� 0� JYY� N*� � [� T� 6�           0  1 2 2 K 3        L      ^    _