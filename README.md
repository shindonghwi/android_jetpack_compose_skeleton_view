# JetpackCompose_SkeletonView


[![](https://jitpack.io/v/shindonghwi/JetpackCompose_SkeletonView.svg)](https://jitpack.io/#shindonghwi/JetpackCompose_SkeletonView)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/Sangmeebee/SMNetworkChecker/blob/main/LICENSE)

![skeleton_ui](https://user-images.githubusercontent.com/45490440/161437799-208d4bac-91bf-47f5-960a-6f7258636cd5.gif)


### 0. Blog
  - [SkeletonView 포스팅](https://wolf-android-developer.medium.com/jetpackcompose-skeleton-ui-cef0ee2d2052)

---------------------------------------------------------------------------------------------------------

### 1. Setting jitpack
```

if ( your version >= Arctic Fox ) {

    // root - setting.gradle
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
            maven { url "https://jitpack.io" }
            jcenter()
        }
    }

} else {

    // root - build.gradle
    	allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }

}

```
<br/>

### 2. Add Dependency in Your App Module 
```
dependencies {
    implementation 'com.github.shindonghwi:JetpackCompose_SkeletonView:x.y.z' // newest => 1.0.3
}
```
<br/>


### 3. Sample Use
```

/**
* @param modifier         | modifier 수정자
* @param colorList        | 스켈레톤 UI에 보일 색상 리스트 
* @param repeatMode       | 반복모드 설정 
* @param repeatDelayTime  | 스켈레톤 UI의 한 사이클이 지난 후 딜레이 타임 설정
* @param speed            | 스켈레톤 UI의 속도
*/

SkeletonView(
    modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .clip(RoundedCornerShape(8.dp)),
    repeatDelayTime = 100
)
```
<br/>

## License 
 ```
Copyright 2022 ShinDongHwi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
