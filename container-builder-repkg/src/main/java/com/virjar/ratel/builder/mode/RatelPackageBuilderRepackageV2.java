package com.virjar.ratel.builder.mode;

import com.virjar.ratel.builder.BuildParamMeta;
import com.virjar.ratel.builder.ratelentry.BuilderContext;

import org.apache.commons.cli.CommandLine;
import org.apache.tools.zip.ZipOutputStream;

import java.io.File;
import java.util.Properties;

public class RatelPackageBuilderRepackageV2 {
    public static void handleTask(File workDir, BuilderContext param, BuildParamMeta buildParamMeta,
                                  Properties ratelBuildProperties,
                                  ZipOutputStream zos, CommandLine cmd

    ) {

        //new ZipFile(buildParamMeta.o)
    }
}
