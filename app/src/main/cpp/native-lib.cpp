#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_id_kotlin_nativekit_MainActivity_apiKey(JNIEnv *env, jobject) {
    std::string key = "c2VjdXJlIGFwcCBrZXk=";
    return env->NewStringUTF(key.c_str());
}