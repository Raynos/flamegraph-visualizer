```bash
# Java
protoc -I=protobuf/src/main/java --java_out=protobuf/src/main/gen protobuf/src/main/java/com/github/kornilova_l/flamegraph/proto/event.proto
protoc -I=protobuf/src/main/java --java_out=protobuf/src/main/gen protobuf/src/main/java/com/github/kornilova_l/flamegraph/proto/tree.proto
protoc -I=protobuf/src/main/java --java_out=protobuf/src/main/gen protobuf/src/main/java/com/github/kornilova_l/flamegraph/proto/trees.proto
protoc -I=protobuf/src/main/java --java_out=protobuf/src/main/gen protobuf/src/main/java/com/github/kornilova_l/flamegraph/proto/tree_preview.proto
protoc -I=protobuf/src/main/java --java_out=protobuf/src/main/gen protobuf/src/main/java/com/github/kornilova_l/flamegraph/proto/trees_preview.proto
perl -p -i -e 's/com.google.protobuf/com.github.kornilova_l.libs.com.google.protobuf/g' protobuf/src/main/gen/com/github/kornilova_l/flamegraph/proto/*.java

# JavaScript
cd protobuf/src/main/java
protoc --js_out=import_style=commonjs,binary:. \
 com/github/kornilova_l/flamegraph/proto/event.proto \
 com/github/kornilova_l/flamegraph/proto/tree.proto \
 com/github/kornilova_l/flamegraph/proto/trees.proto \
 com/github/kornilova_l/flamegraph/proto/tree_preview.proto \
 com/github/kornilova_l/flamegraph/proto/trees_preview.proto
mv com/github/kornilova_l/flamegraph/proto/*.js ../../../../visualization/static/js/generated
cd ../../../../
perl -p -i -e "s/require\('..\/..\/..\/..\/..\/com\/github\/kornilova_l\/flamegraph\/proto/require('./g" visualization/static/js/generated/*.js
```