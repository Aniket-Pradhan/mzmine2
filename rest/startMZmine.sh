#!/bin/sh

SCRIPTDIR=`dirname "$0"`
cd "$SCRIPTDIR"

java -Djava.util.logging.config.file=conf/logging.properties -Xms1024m -Xmx2048m -cp MZmine2.jar net.sf.mzmine.main.MZmineClient
