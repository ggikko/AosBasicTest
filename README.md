# AosBasicTest

    testApt 'com.google.dagger:dagger-compiler:2.0.2'
    testCompile 'junit:junit:4.12'
    testCompile 'org.mockito:mockito-core:1.10.19'
    testCompile 'org.hamcrest:hamcrest-library:1.3'
    testCompile 'org.robolectric:robolectric:3.0-rc3'
    testCompile 'org.robolectric:shadows-support-v4:3.0'
    testCompile 'org.robolectric:shadows-multidex:3.0'

    androidTestCompile 'com.android.support.test:runner:0.5'
    androidTestCompile 'com.android.support.test.espresso:espresso-core:2.2.2'
    
    + jacoco
