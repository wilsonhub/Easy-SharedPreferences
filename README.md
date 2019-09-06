Easy SharedPreferences
=======

Easy SharedPreferences is a library where users can stored their data in Shared Preferences in easier way. It provides to store the data in all primitive data type format as well as object and list of custom object format.

## How to build

Add the JitPack repository in your build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

And add the dependency [![](https://jitpack.io/v/wils0n28/Easy-SharedPreferences.svg)](https://jitpack.io/#wils0n28/Easy-SharedPreferences) replacing ${version} with the version number in jitpack
```java
dependencies {
	        implementation 'com.github.wils0n28:Easy-SharedPreferences:${version}'
	}
```
## How to use
1) Initialize the LocalStorage Class like this-
 ```java
 LocalStorage.initLibrary(this);
```
2) Then to store and retrieve  Data use the functions like this-

**For String:**
```java
   LocalStorage.setString(<key>,<Value>);
   LocalStorage.getString(<key>);
```

**For Integer:**
```java
   LocalStorage.setInt(<key>,<Value>);
   LocalStorage.getInt(<key>);
 ```
**For Boolean:**
```java
   LocalStorage.setBoolean(<key>,<Value>);
   LocalStorage.getBoolean(<key>);
```
**For Double:**
```java
   LocalStorage.setDouble(<key>,<Value>);
   LocalStorage.getDouble(<key>);
  ```
 **For Long:**
 ```java
   LocalStorage.setLong(<key>,<Value>);
   LocalStorage.getLong(<key>);
  ```
 **For Object:**
 ```java
   LocalStorage.setObject(<key>,<Object>);
   LocalStorage.getObject(<key>,<.class type of the object>);
 ```
   **Eg:**
   ```java
   LocalStorage.setObject("object",PassengerDetails.class);
   LocalStorage.getObject("object",PassengerDetails.class);
 ```
  **For List:**
  ```java
   LocalStorage.setListObject(<key>,<ArrayList<Object>>);
   LocalStorage.getListObject(<key>,<.class type of the object>);
  ```
   **Eg:**
   ```java
   ArrayList<Object>list=new ArrayList<Object>();
   LocalStorage.setListObject("object",list);
   LocalStorage.getListObject("object",PassengerDetails.class);
   ```
   **For Image:**
   ```java
   LocalStorage.saveImage(<String theFolder>,<String theImageName>,<Bitmap theBitmap>);
   LocalStorage.getSavedImage(<String savedImagePath>);
   ```

3) Then to clear all the data-
```java
   LocalStorage.clearAll();
```

4) Then to clear specific Data-
```java
   LocalStorage.clearKey(<key>);
```

##### Any Queries? or Feedback, please let me know by opening a [new issue](https://github.com/wils0n28/Easy-SharedPreferences/issues/new)!

## Contact
#### Wilson S

* :email: e-mail: jackwilson7284@gmail.com


