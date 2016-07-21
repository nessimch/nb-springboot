/*
 * Copyright 2016 Alessandro Falappa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexfalappa.nbspringboot.templates;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.spi.java.project.support.ui.templates.JavaTemplates;
import org.openide.WizardDescriptor;
import org.openide.util.NbBundle;

/**
 * Spring and Spring Boot related file templates.
 *
 * @author Alessandro Falappa
 */
public class FileTemplates {

    public static final String FOLDER_SPRING = "Spring";
    public static final String FOLDER_SPRING_MVC = "Spring MVC";
    public static final String FOLDER_SPRING_DATA = "Spring Data";
    public static final String FOLDER_SPRING_BOOT = "Spring Boot";

    @TemplateRegistration(
            folder = FOLDER_SPRING_BOOT,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/boot-class.png",
            displayName = "#cfgprops_displayName",
            content = "CfgProperties.java.template",
            description = "CfgProperties.html",
            scriptEngine = "freemarker",
            position = 100)
    @NbBundle.Messages(value = "cfgprops_displayName=Configuration properties class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> cfgProperties() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING_BOOT,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/boot-class.png",
            displayName = "#cmdlinerunner_displayName",
            content = "CmdLineRunner.java.template",
            description = "CmdLineRunner.html",
            scriptEngine = "freemarker",
            position = 200)
    @NbBundle.Messages(value = "cmdlinerunner_displayName=CommandLineRunner class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> cmdLineRunner() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING_BOOT,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/boot-class.png",
            displayName = "#applrunner_displayName",
            content = "ApplRunner.java.template",
            description = "ApplRunner.html",
            scriptEngine = "freemarker",
            position = 300)
    @NbBundle.Messages(value = "applrunner_displayName=ApplicationRunner class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> applicationRunner() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/spring-class.png",
            displayName = "#config_displayName",
            content = "Configuration.java.template",
            description = "Configuration.html",
            scriptEngine = "freemarker",
            position = 100)
    @NbBundle.Messages(value = "config_displayName=Configuration class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> configuration() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/spring-class.png",
            displayName = "#component_displayName",
            content = "Component.java.template",
            description = "Component.html",
            scriptEngine = "freemarker",
            position = 200)
    @NbBundle.Messages(value = "component_displayName=Component class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> component() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/spring-class.png",
            displayName = "#service_displayName",
            content = "Service.java.template",
            description = "Service.html",
            scriptEngine = "freemarker",
            position = 300)
    @NbBundle.Messages(value = "service_displayName=Service class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> service() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING_MVC,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/spring-class.png",
            displayName = "#controller_displayName",
            content = "Controller.java.template",
            description = "Controller.html",
            scriptEngine = "freemarker",
            position = 100)
    @NbBundle.Messages(value = "controller_displayName=Controller class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> controller() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING_MVC,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/spring-class.png",
            displayName = "#rest_displayName",
            content = "RestController.java.template",
            description = "RestController.html",
            scriptEngine = "freemarker",
            position = 200)
    @NbBundle.Messages(value = "rest_displayName=REST controller class")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> restController() {
        return JavaTemplates.createJavaTemplateIterator();
    }

    @TemplateRegistration(
            folder = FOLDER_SPRING_DATA,
            iconBase = "com/github/alexfalappa/nbspringboot/templates/repository-interface.png",
            displayName = "#repo_displayName",
            content = "Repository.java.template",
            description = "Repository.html",
            scriptEngine = "freemarker",
            position = 100)
    @NbBundle.Messages(value = "repo_displayName=Repository interface")
    public static WizardDescriptor.InstantiatingIterator<WizardDescriptor> repository() {
        return JavaTemplates.createJavaTemplateIterator();
    }

}