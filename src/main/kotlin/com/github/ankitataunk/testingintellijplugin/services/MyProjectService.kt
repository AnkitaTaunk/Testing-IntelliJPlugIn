package com.github.ankitataunk.testingintellijplugin.services

import com.github.ankitataunk.testingintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
