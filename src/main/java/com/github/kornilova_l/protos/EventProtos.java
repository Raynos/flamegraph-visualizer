package com.github.kornilova_l.protos;

public final class EventProtos {
  private EventProtos() {}
  public static void registerAllExtensions(
      com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.github.kornilova_l.protos.Event)
      com.github.kornilova_l.libs.com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 thread_id = 1;</code>
     */
    long getThreadId();

    /**
     * <code>int64 time = 2;</code>
     */
    long getTime();

    /**
     * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
     */
    com.github.kornilova_l.protos.EventProtos.Event.Enter getEnter();
    /**
     * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
     */
    com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder getEnterOrBuilder();

    /**
     * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
     */
    com.github.kornilova_l.protos.EventProtos.Event.Exit getExit();
    /**
     * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
     */
    com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder getExitOrBuilder();

    /**
     * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
     */
    com.github.kornilova_l.protos.EventProtos.Event.Exception getException();
    /**
     * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
     */
    com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder getExceptionOrBuilder();

    public com.github.kornilova_l.protos.EventProtos.Event.InfoCase getInfoCase();
  }
  /**
   * Protobuf type {@code com.github.kornilova_l.protos.Event}
   */
  public  static final class Event extends
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.github.kornilova_l.protos.Event)
      EventOrBuilder {
    // Use Event.newBuilder() to construct.
    private Event(com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Event() {
      threadId_ = 0L;
      time_ = 0L;
    }

    @java.lang.Override
    public final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Event(
        com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              threadId_ = input.readInt64();
              break;
            }
            case 16: {

              time_ = input.readInt64();
              break;
            }
            case 26: {
              com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder subBuilder = null;
              if (infoCase_ == 3) {
                subBuilder = ((com.github.kornilova_l.protos.EventProtos.Event.Enter) info_).toBuilder();
              }
              info_ =
                  input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Enter.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Enter) info_);
                info_ = subBuilder.buildPartial();
              }
              infoCase_ = 3;
              break;
            }
            case 34: {
              com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder subBuilder = null;
              if (infoCase_ == 4) {
                subBuilder = ((com.github.kornilova_l.protos.EventProtos.Event.Exit) info_).toBuilder();
              }
              info_ =
                  input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Exit.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Exit) info_);
                info_ = subBuilder.buildPartial();
              }
              infoCase_ = 4;
              break;
            }
            case 42: {
              com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder subBuilder = null;
              if (infoCase_ == 5) {
                subBuilder = ((com.github.kornilova_l.protos.EventProtos.Event.Exception) info_).toBuilder();
              }
              info_ =
                  input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Exception.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Exception) info_);
                info_ = subBuilder.buildPartial();
              }
              infoCase_ = 5;
              break;
            }
          }
        }
      } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_descriptor;
    }

    protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.kornilova_l.protos.EventProtos.Event.class, com.github.kornilova_l.protos.EventProtos.Event.Builder.class);
    }

    public interface EnterOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.github.kornilova_l.protos.Event.Enter)
        com.github.kornilova_l.libs.com.google.protobuf.MessageOrBuilder {

      /**
       * <code>string class_name = 1;</code>
       */
      java.lang.String getClassName();
      /**
       * <code>string class_name = 1;</code>
       */
      com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getClassNameBytes();

      /**
       * <code>string method_name = 2;</code>
       */
      java.lang.String getMethodName();
      /**
       * <code>string method_name = 2;</code>
       */
      com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getMethodNameBytes();

      /**
       * <code>bool is_static = 3;</code>
       */
      boolean getIsStatic();

      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      java.util.List<com.github.kornilova_l.protos.EventProtos.Event.Var>
          getParametersList();
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.Var getParameters(int index);
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      int getParametersCount();
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      java.util.List<? extends com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>
          getParametersOrBuilderList();
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder getParametersOrBuilder(
          int index);
    }
    /**
     * Protobuf type {@code com.github.kornilova_l.protos.Event.Enter}
     */
    public  static final class Enter extends
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.github.kornilova_l.protos.Event.Enter)
        EnterOrBuilder {
      // Use Enter.newBuilder() to construct.
      private Enter(com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Enter() {
        className_ = "";
        methodName_ = "";
        isStatic_ = false;
        parameters_ = java.util.Collections.emptyList();
      }

      @java.lang.Override
      public final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private Enter(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                java.lang.String s = input.readStringRequireUtf8();

                className_ = s;
                break;
              }
              case 18: {
                java.lang.String s = input.readStringRequireUtf8();

                methodName_ = s;
                break;
              }
              case 24: {

                isStatic_ = input.readBool();
                break;
              }
              case 34: {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  parameters_ = new java.util.ArrayList<com.github.kornilova_l.protos.EventProtos.Event.Var>();
                  mutable_bitField0_ |= 0x00000008;
                }
                parameters_.add(
                    input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Var.parser(), extensionRegistry));
                break;
              }
            }
          }
        } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
            parameters_ = java.util.Collections.unmodifiableList(parameters_);
          }
          makeExtensionsImmutable();
        }
      }
      public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Enter_descriptor;
      }

      protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Enter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.kornilova_l.protos.EventProtos.Event.Enter.class, com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder.class);
      }

      private int bitField0_;
      public static final int CLASS_NAME_FIELD_NUMBER = 1;
      private volatile java.lang.Object className_;
      /**
       * <code>string class_name = 1;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
              (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          className_ = s;
          return s;
        }
      }
      /**
       * <code>string class_name = 1;</code>
       */
      public com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof java.lang.String) {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
              com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
        }
      }

      public static final int METHOD_NAME_FIELD_NUMBER = 2;
      private volatile java.lang.Object methodName_;
      /**
       * <code>string method_name = 2;</code>
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
              (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          methodName_ = s;
          return s;
        }
      }
      /**
       * <code>string method_name = 2;</code>
       */
      public com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof java.lang.String) {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
              com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
        }
      }

      public static final int IS_STATIC_FIELD_NUMBER = 3;
      private boolean isStatic_;
      /**
       * <code>bool is_static = 3;</code>
       */
      public boolean getIsStatic() {
        return isStatic_;
      }

      public static final int PARAMETERS_FIELD_NUMBER = 4;
      private java.util.List<com.github.kornilova_l.protos.EventProtos.Event.Var> parameters_;
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      public java.util.List<com.github.kornilova_l.protos.EventProtos.Event.Var> getParametersList() {
        return parameters_;
      }
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      public java.util.List<? extends com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>
          getParametersOrBuilderList() {
        return parameters_;
      }
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      public int getParametersCount() {
        return parameters_.size();
      }
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Var getParameters(int index) {
        return parameters_.get(index);
      }
      /**
       * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder getParametersOrBuilder(
          int index) {
        return parameters_.get(index);
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (!getClassNameBytes().isEmpty()) {
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, className_);
        }
        if (!getMethodNameBytes().isEmpty()) {
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, methodName_);
        }
        if (isStatic_ != false) {
          output.writeBool(3, isStatic_);
        }
        for (int i = 0; i < parameters_.size(); i++) {
          output.writeMessage(4, parameters_.get(i));
        }
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getClassNameBytes().isEmpty()) {
          size += com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, className_);
        }
        if (!getMethodNameBytes().isEmpty()) {
          size += com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, methodName_);
        }
        if (isStatic_ != false) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeBoolSize(3, isStatic_);
        }
        for (int i = 0; i < parameters_.size(); i++) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, parameters_.get(i));
        }
        memoizedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof com.github.kornilova_l.protos.EventProtos.Event.Enter)) {
          return super.equals(obj);
        }
        com.github.kornilova_l.protos.EventProtos.Event.Enter other = (com.github.kornilova_l.protos.EventProtos.Event.Enter) obj;

        boolean result = true;
        result = result && getClassName()
            .equals(other.getClassName());
        result = result && getMethodName()
            .equals(other.getMethodName());
        result = result && (getIsStatic()
            == other.getIsStatic());
        result = result && getParametersList()
            .equals(other.getParametersList());
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + CLASS_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getClassName().hashCode();
        hash = (37 * hash) + METHOD_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getMethodName().hashCode();
        hash = (37 * hash) + IS_STATIC_FIELD_NUMBER;
        hash = (53 * hash) + com.github.kornilova_l.libs.com.google.protobuf.Internal.hashBoolean(
            getIsStatic());
        if (getParametersCount() > 0) {
          hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
          hash = (53 * hash) + getParametersList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          java.nio.ByteBuffer data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          java.nio.ByteBuffer data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(byte[] data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          byte[] data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseDelimitedFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Enter parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(com.github.kornilova_l.protos.EventProtos.Event.Enter prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code com.github.kornilova_l.protos.Event.Enter}
       */
      public static final class Builder extends
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.github.kornilova_l.protos.Event.Enter)
          com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder {
        public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Enter_descriptor;
        }

        protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Enter_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.github.kornilova_l.protos.EventProtos.Event.Enter.class, com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder.class);
        }

        // Construct using com.github.kornilova_l.protos.EventProtos.Event.Enter.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
            getParametersFieldBuilder();
          }
        }
        public Builder clear() {
          super.clear();
          className_ = "";

          methodName_ = "";

          isStatic_ = false;

          if (parametersBuilder_ == null) {
            parameters_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            parametersBuilder_.clear();
          }
          return this;
        }

        public com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Enter_descriptor;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Enter getDefaultInstanceForType() {
          return com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Enter build() {
          com.github.kornilova_l.protos.EventProtos.Event.Enter result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Enter buildPartial() {
          com.github.kornilova_l.protos.EventProtos.Event.Enter result = new com.github.kornilova_l.protos.EventProtos.Event.Enter(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          result.className_ = className_;
          result.methodName_ = methodName_;
          result.isStatic_ = isStatic_;
          if (parametersBuilder_ == null) {
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              parameters_ = java.util.Collections.unmodifiableList(parameters_);
              bitField0_ = (bitField0_ & ~0x00000008);
            }
            result.parameters_ = parameters_;
          } else {
            result.parameters_ = parametersBuilder_.build();
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.github.kornilova_l.libs.com.google.protobuf.Message other) {
          if (other instanceof com.github.kornilova_l.protos.EventProtos.Event.Enter) {
            return mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Enter)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.github.kornilova_l.protos.EventProtos.Event.Enter other) {
          if (other == com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance()) return this;
          if (!other.getClassName().isEmpty()) {
            className_ = other.className_;
            onChanged();
          }
          if (!other.getMethodName().isEmpty()) {
            methodName_ = other.methodName_;
            onChanged();
          }
          if (other.getIsStatic() != false) {
            setIsStatic(other.getIsStatic());
          }
          if (parametersBuilder_ == null) {
            if (!other.parameters_.isEmpty()) {
              if (parameters_.isEmpty()) {
                parameters_ = other.parameters_;
                bitField0_ = (bitField0_ & ~0x00000008);
              } else {
                ensureParametersIsMutable();
                parameters_.addAll(other.parameters_);
              }
              onChanged();
            }
          } else {
            if (!other.parameters_.isEmpty()) {
              if (parametersBuilder_.isEmpty()) {
                parametersBuilder_.dispose();
                parametersBuilder_ = null;
                parameters_ = other.parameters_;
                bitField0_ = (bitField0_ & ~0x00000008);
                parametersBuilder_ =
                  com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                     getParametersFieldBuilder() : null;
              } else {
                parametersBuilder_.addAllMessages(other.parameters_);
              }
            }
          }
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          return true;
        }

        public Builder mergeFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.github.kornilova_l.protos.EventProtos.Event.Enter parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.github.kornilova_l.protos.EventProtos.Event.Enter) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private java.lang.Object className_ = "";
        /**
         * <code>string class_name = 1;</code>
         */
        public java.lang.String getClassName() {
          java.lang.Object ref = className_;
          if (!(ref instanceof java.lang.String)) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
                (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            className_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>string class_name = 1;</code>
         */
        public com.github.kornilova_l.libs.com.google.protobuf.ByteString
            getClassNameBytes() {
          java.lang.Object ref = className_;
          if (ref instanceof String) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
                com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            className_ = b;
            return b;
          } else {
            return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string class_name = 1;</code>
         */
        public Builder setClassName(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }

          className_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string class_name = 1;</code>
         */
        public Builder clearClassName() {

          className_ = getDefaultInstance().getClassName();
          onChanged();
          return this;
        }
        /**
         * <code>string class_name = 1;</code>
         */
        public Builder setClassNameBytes(
            com.github.kornilova_l.libs.com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

          className_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object methodName_ = "";
        /**
         * <code>string method_name = 2;</code>
         */
        public java.lang.String getMethodName() {
          java.lang.Object ref = methodName_;
          if (!(ref instanceof java.lang.String)) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
                (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            methodName_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>string method_name = 2;</code>
         */
        public com.github.kornilova_l.libs.com.google.protobuf.ByteString
            getMethodNameBytes() {
          java.lang.Object ref = methodName_;
          if (ref instanceof String) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
                com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            methodName_ = b;
            return b;
          } else {
            return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string method_name = 2;</code>
         */
        public Builder setMethodName(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }

          methodName_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string method_name = 2;</code>
         */
        public Builder clearMethodName() {

          methodName_ = getDefaultInstance().getMethodName();
          onChanged();
          return this;
        }
        /**
         * <code>string method_name = 2;</code>
         */
        public Builder setMethodNameBytes(
            com.github.kornilova_l.libs.com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

          methodName_ = value;
          onChanged();
          return this;
        }

        private boolean isStatic_ ;
        /**
         * <code>bool is_static = 3;</code>
         */
        public boolean getIsStatic() {
          return isStatic_;
        }
        /**
         * <code>bool is_static = 3;</code>
         */
        public Builder setIsStatic(boolean value) {

          isStatic_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>bool is_static = 3;</code>
         */
        public Builder clearIsStatic() {

          isStatic_ = false;
          onChanged();
          return this;
        }

        private java.util.List<com.github.kornilova_l.protos.EventProtos.Event.Var> parameters_ =
          java.util.Collections.emptyList();
        private void ensureParametersIsMutable() {
          if (!((bitField0_ & 0x00000008) == 0x00000008)) {
            parameters_ = new java.util.ArrayList<com.github.kornilova_l.protos.EventProtos.Event.Var>(parameters_);
            bitField0_ |= 0x00000008;
           }
        }

        private com.github.kornilova_l.libs.com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Var, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder, com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder> parametersBuilder_;

        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public java.util.List<com.github.kornilova_l.protos.EventProtos.Event.Var> getParametersList() {
          if (parametersBuilder_ == null) {
            return java.util.Collections.unmodifiableList(parameters_);
          } else {
            return parametersBuilder_.getMessageList();
          }
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public int getParametersCount() {
          if (parametersBuilder_ == null) {
            return parameters_.size();
          } else {
            return parametersBuilder_.getCount();
          }
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Var getParameters(int index) {
          if (parametersBuilder_ == null) {
            return parameters_.get(index);
          } else {
            return parametersBuilder_.getMessage(index);
          }
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder setParameters(
            int index, com.github.kornilova_l.protos.EventProtos.Event.Var value) {
          if (parametersBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureParametersIsMutable();
            parameters_.set(index, value);
            onChanged();
          } else {
            parametersBuilder_.setMessage(index, value);
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder setParameters(
            int index, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder builderForValue) {
          if (parametersBuilder_ == null) {
            ensureParametersIsMutable();
            parameters_.set(index, builderForValue.build());
            onChanged();
          } else {
            parametersBuilder_.setMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder addParameters(com.github.kornilova_l.protos.EventProtos.Event.Var value) {
          if (parametersBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureParametersIsMutable();
            parameters_.add(value);
            onChanged();
          } else {
            parametersBuilder_.addMessage(value);
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder addParameters(
            int index, com.github.kornilova_l.protos.EventProtos.Event.Var value) {
          if (parametersBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensureParametersIsMutable();
            parameters_.add(index, value);
            onChanged();
          } else {
            parametersBuilder_.addMessage(index, value);
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder addParameters(
            com.github.kornilova_l.protos.EventProtos.Event.Var.Builder builderForValue) {
          if (parametersBuilder_ == null) {
            ensureParametersIsMutable();
            parameters_.add(builderForValue.build());
            onChanged();
          } else {
            parametersBuilder_.addMessage(builderForValue.build());
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder addParameters(
            int index, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder builderForValue) {
          if (parametersBuilder_ == null) {
            ensureParametersIsMutable();
            parameters_.add(index, builderForValue.build());
            onChanged();
          } else {
            parametersBuilder_.addMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder addAllParameters(
            java.lang.Iterable<? extends com.github.kornilova_l.protos.EventProtos.Event.Var> values) {
          if (parametersBuilder_ == null) {
            ensureParametersIsMutable();
            com.github.kornilova_l.libs.com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, parameters_);
            onChanged();
          } else {
            parametersBuilder_.addAllMessages(values);
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder clearParameters() {
          if (parametersBuilder_ == null) {
            parameters_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
            onChanged();
          } else {
            parametersBuilder_.clear();
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public Builder removeParameters(int index) {
          if (parametersBuilder_ == null) {
            ensureParametersIsMutable();
            parameters_.remove(index);
            onChanged();
          } else {
            parametersBuilder_.remove(index);
          }
          return this;
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Var.Builder getParametersBuilder(
            int index) {
          return getParametersFieldBuilder().getBuilder(index);
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder getParametersOrBuilder(
            int index) {
          if (parametersBuilder_ == null) {
            return parameters_.get(index);  } else {
            return parametersBuilder_.getMessageOrBuilder(index);
          }
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public java.util.List<? extends com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>
             getParametersOrBuilderList() {
          if (parametersBuilder_ != null) {
            return parametersBuilder_.getMessageOrBuilderList();
          } else {
            return java.util.Collections.unmodifiableList(parameters_);
          }
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Var.Builder addParametersBuilder() {
          return getParametersFieldBuilder().addBuilder(
              com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance());
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Var.Builder addParametersBuilder(
            int index) {
          return getParametersFieldBuilder().addBuilder(
              index, com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance());
        }
        /**
         * <code>repeated .com.github.kornilova_l.protos.Event.Var parameters = 4;</code>
         */
        public java.util.List<com.github.kornilova_l.protos.EventProtos.Event.Var.Builder>
             getParametersBuilderList() {
          return getParametersFieldBuilder().getBuilderList();
        }
        private com.github.kornilova_l.libs.com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Var, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder, com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>
            getParametersFieldBuilder() {
          if (parametersBuilder_ == null) {
            parametersBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.RepeatedFieldBuilderV3<
                com.github.kornilova_l.protos.EventProtos.Event.Var, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder, com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>(
                    parameters_,
                    ((bitField0_ & 0x00000008) == 0x00000008),
                    getParentForChildren(),
                    isClean());
            parameters_ = null;
          }
          return parametersBuilder_;
        }
        public final Builder setUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }

        public final Builder mergeUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }


        // @@protoc_insertion_point(builder_scope:com.github.kornilova_l.protos.Event.Enter)
      }

      // @@protoc_insertion_point(class_scope:com.github.kornilova_l.protos.Event.Enter)
      private static final com.github.kornilova_l.protos.EventProtos.Event.Enter DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new com.github.kornilova_l.protos.EventProtos.Event.Enter();
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Enter getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.github.kornilova_l.libs.com.google.protobuf.Parser<Enter>
          PARSER = new com.github.kornilova_l.libs.com.google.protobuf.AbstractParser<Enter>() {
        public Enter parsePartialFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
            return new Enter(input, extensionRegistry);
        }
      };

      public static com.github.kornilova_l.libs.com.google.protobuf.Parser<Enter> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.github.kornilova_l.libs.com.google.protobuf.Parser<Enter> getParserForType() {
        return PARSER;
      }

      public com.github.kornilova_l.protos.EventProtos.Event.Enter getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface ExitOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.github.kornilova_l.protos.Event.Exit)
        com.github.kornilova_l.libs.com.google.protobuf.MessageOrBuilder {

      /**
       * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
       */
      boolean hasReturnValue();
      /**
       * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.Var getReturnValue();
      /**
       * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder getReturnValueOrBuilder();
    }
    /**
     * Protobuf type {@code com.github.kornilova_l.protos.Event.Exit}
     */
    public  static final class Exit extends
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.github.kornilova_l.protos.Event.Exit)
        ExitOrBuilder {
      // Use Exit.newBuilder() to construct.
      private Exit(com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Exit() {
      }

      @java.lang.Override
      public final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private Exit(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.github.kornilova_l.protos.EventProtos.Event.Var.Builder subBuilder = null;
                if (returnValue_ != null) {
                  subBuilder = returnValue_.toBuilder();
                }
                returnValue_ = input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Var.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(returnValue_);
                  returnValue_ = subBuilder.buildPartial();
                }

                break;
              }
            }
          }
        } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          makeExtensionsImmutable();
        }
      }
      public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exit_descriptor;
      }

      protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.kornilova_l.protos.EventProtos.Event.Exit.class, com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder.class);
      }

      public static final int RETURN_VALUE_FIELD_NUMBER = 1;
      private com.github.kornilova_l.protos.EventProtos.Event.Var returnValue_;
      /**
       * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
       */
      public boolean hasReturnValue() {
        return returnValue_ != null;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Var getReturnValue() {
        return returnValue_ == null ? com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance() : returnValue_;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder getReturnValueOrBuilder() {
        return getReturnValue();
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (returnValue_ != null) {
          output.writeMessage(1, getReturnValue());
        }
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (returnValue_ != null) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, getReturnValue());
        }
        memoizedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof com.github.kornilova_l.protos.EventProtos.Event.Exit)) {
          return super.equals(obj);
        }
        com.github.kornilova_l.protos.EventProtos.Event.Exit other = (com.github.kornilova_l.protos.EventProtos.Event.Exit) obj;

        boolean result = true;
        result = result && (hasReturnValue() == other.hasReturnValue());
        if (hasReturnValue()) {
          result = result && getReturnValue()
              .equals(other.getReturnValue());
        }
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasReturnValue()) {
          hash = (37 * hash) + RETURN_VALUE_FIELD_NUMBER;
          hash = (53 * hash) + getReturnValue().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          java.nio.ByteBuffer data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          java.nio.ByteBuffer data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(byte[] data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          byte[] data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseDelimitedFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exit parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(com.github.kornilova_l.protos.EventProtos.Event.Exit prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code com.github.kornilova_l.protos.Event.Exit}
       */
      public static final class Builder extends
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.github.kornilova_l.protos.Event.Exit)
          com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder {
        public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exit_descriptor;
        }

        protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exit_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.github.kornilova_l.protos.EventProtos.Event.Exit.class, com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder.class);
        }

        // Construct using com.github.kornilova_l.protos.EventProtos.Event.Exit.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        public Builder clear() {
          super.clear();
          if (returnValueBuilder_ == null) {
            returnValue_ = null;
          } else {
            returnValue_ = null;
            returnValueBuilder_ = null;
          }
          return this;
        }

        public com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exit_descriptor;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Exit getDefaultInstanceForType() {
          return com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Exit build() {
          com.github.kornilova_l.protos.EventProtos.Event.Exit result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Exit buildPartial() {
          com.github.kornilova_l.protos.EventProtos.Event.Exit result = new com.github.kornilova_l.protos.EventProtos.Event.Exit(this);
          if (returnValueBuilder_ == null) {
            result.returnValue_ = returnValue_;
          } else {
            result.returnValue_ = returnValueBuilder_.build();
          }
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.github.kornilova_l.libs.com.google.protobuf.Message other) {
          if (other instanceof com.github.kornilova_l.protos.EventProtos.Event.Exit) {
            return mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Exit)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.github.kornilova_l.protos.EventProtos.Event.Exit other) {
          if (other == com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance()) return this;
          if (other.hasReturnValue()) {
            mergeReturnValue(other.getReturnValue());
          }
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          return true;
        }

        public Builder mergeFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.github.kornilova_l.protos.EventProtos.Event.Exit parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.github.kornilova_l.protos.EventProtos.Event.Exit) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private com.github.kornilova_l.protos.EventProtos.Event.Var returnValue_ = null;
        private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Var, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder, com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder> returnValueBuilder_;
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public boolean hasReturnValue() {
          return returnValueBuilder_ != null || returnValue_ != null;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Var getReturnValue() {
          if (returnValueBuilder_ == null) {
            return returnValue_ == null ? com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance() : returnValue_;
          } else {
            return returnValueBuilder_.getMessage();
          }
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public Builder setReturnValue(com.github.kornilova_l.protos.EventProtos.Event.Var value) {
          if (returnValueBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            returnValue_ = value;
            onChanged();
          } else {
            returnValueBuilder_.setMessage(value);
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public Builder setReturnValue(
            com.github.kornilova_l.protos.EventProtos.Event.Var.Builder builderForValue) {
          if (returnValueBuilder_ == null) {
            returnValue_ = builderForValue.build();
            onChanged();
          } else {
            returnValueBuilder_.setMessage(builderForValue.build());
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public Builder mergeReturnValue(com.github.kornilova_l.protos.EventProtos.Event.Var value) {
          if (returnValueBuilder_ == null) {
            if (returnValue_ != null) {
              returnValue_ =
                com.github.kornilova_l.protos.EventProtos.Event.Var.newBuilder(returnValue_).mergeFrom(value).buildPartial();
            } else {
              returnValue_ = value;
            }
            onChanged();
          } else {
            returnValueBuilder_.mergeFrom(value);
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public Builder clearReturnValue() {
          if (returnValueBuilder_ == null) {
            returnValue_ = null;
            onChanged();
          } else {
            returnValue_ = null;
            returnValueBuilder_ = null;
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Var.Builder getReturnValueBuilder() {

          onChanged();
          return getReturnValueFieldBuilder().getBuilder();
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder getReturnValueOrBuilder() {
          if (returnValueBuilder_ != null) {
            return returnValueBuilder_.getMessageOrBuilder();
          } else {
            return returnValue_ == null ?
                com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance() : returnValue_;
          }
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Var return_value = 1;</code>
         */
        private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Var, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder, com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>
            getReturnValueFieldBuilder() {
          if (returnValueBuilder_ == null) {
            returnValueBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
                com.github.kornilova_l.protos.EventProtos.Event.Var, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder, com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder>(
                    getReturnValue(),
                    getParentForChildren(),
                    isClean());
            returnValue_ = null;
          }
          return returnValueBuilder_;
        }
        public final Builder setUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }

        public final Builder mergeUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }


        // @@protoc_insertion_point(builder_scope:com.github.kornilova_l.protos.Event.Exit)
      }

      // @@protoc_insertion_point(class_scope:com.github.kornilova_l.protos.Event.Exit)
      private static final com.github.kornilova_l.protos.EventProtos.Event.Exit DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new com.github.kornilova_l.protos.EventProtos.Event.Exit();
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Exit getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.github.kornilova_l.libs.com.google.protobuf.Parser<Exit>
          PARSER = new com.github.kornilova_l.libs.com.google.protobuf.AbstractParser<Exit>() {
        public Exit parsePartialFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
            return new Exit(input, extensionRegistry);
        }
      };

      public static com.github.kornilova_l.libs.com.google.protobuf.Parser<Exit> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.github.kornilova_l.libs.com.google.protobuf.Parser<Exit> getParserForType() {
        return PARSER;
      }

      public com.github.kornilova_l.protos.EventProtos.Event.Exit getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface ExceptionOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.github.kornilova_l.protos.Event.Exception)
        com.github.kornilova_l.libs.com.google.protobuf.MessageOrBuilder {

      /**
       * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
       */
      boolean hasObject();
      /**
       * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.Object getObject();
      /**
       * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder getObjectOrBuilder();
    }
    /**
     * Protobuf type {@code com.github.kornilova_l.protos.Event.Exception}
     */
    public  static final class Exception extends
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.github.kornilova_l.protos.Event.Exception)
        ExceptionOrBuilder {
      // Use Exception.newBuilder() to construct.
      private Exception(com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Exception() {
      }

      @java.lang.Override
      public final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private Exception(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.github.kornilova_l.protos.EventProtos.Event.Object.Builder subBuilder = null;
                if (object_ != null) {
                  subBuilder = object_.toBuilder();
                }
                object_ = input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Object.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }

                break;
              }
            }
          }
        } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          makeExtensionsImmutable();
        }
      }
      public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exception_descriptor;
      }

      protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exception_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.kornilova_l.protos.EventProtos.Event.Exception.class, com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder.class);
      }

      public static final int OBJECT_FIELD_NUMBER = 1;
      private com.github.kornilova_l.protos.EventProtos.Event.Object object_;
      /**
       * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
       */
      public boolean hasObject() {
        return object_ != null;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Object getObject() {
        return object_ == null ? com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance() : object_;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder getObjectOrBuilder() {
        return getObject();
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (object_ != null) {
          output.writeMessage(1, getObject());
        }
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (object_ != null) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, getObject());
        }
        memoizedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof com.github.kornilova_l.protos.EventProtos.Event.Exception)) {
          return super.equals(obj);
        }
        com.github.kornilova_l.protos.EventProtos.Event.Exception other = (com.github.kornilova_l.protos.EventProtos.Event.Exception) obj;

        boolean result = true;
        result = result && (hasObject() == other.hasObject());
        if (hasObject()) {
          result = result && getObject()
              .equals(other.getObject());
        }
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasObject()) {
          hash = (37 * hash) + OBJECT_FIELD_NUMBER;
          hash = (53 * hash) + getObject().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          java.nio.ByteBuffer data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          java.nio.ByteBuffer data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(byte[] data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          byte[] data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseDelimitedFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Exception parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(com.github.kornilova_l.protos.EventProtos.Event.Exception prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code com.github.kornilova_l.protos.Event.Exception}
       */
      public static final class Builder extends
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.github.kornilova_l.protos.Event.Exception)
          com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder {
        public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exception_descriptor;
        }

        protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exception_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.github.kornilova_l.protos.EventProtos.Event.Exception.class, com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder.class);
        }

        // Construct using com.github.kornilova_l.protos.EventProtos.Event.Exception.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        public Builder clear() {
          super.clear();
          if (objectBuilder_ == null) {
            object_ = null;
          } else {
            object_ = null;
            objectBuilder_ = null;
          }
          return this;
        }

        public com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Exception_descriptor;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Exception getDefaultInstanceForType() {
          return com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Exception build() {
          com.github.kornilova_l.protos.EventProtos.Event.Exception result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Exception buildPartial() {
          com.github.kornilova_l.protos.EventProtos.Event.Exception result = new com.github.kornilova_l.protos.EventProtos.Event.Exception(this);
          if (objectBuilder_ == null) {
            result.object_ = object_;
          } else {
            result.object_ = objectBuilder_.build();
          }
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.github.kornilova_l.libs.com.google.protobuf.Message other) {
          if (other instanceof com.github.kornilova_l.protos.EventProtos.Event.Exception) {
            return mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Exception)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.github.kornilova_l.protos.EventProtos.Event.Exception other) {
          if (other == com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance()) return this;
          if (other.hasObject()) {
            mergeObject(other.getObject());
          }
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          return true;
        }

        public Builder mergeFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.github.kornilova_l.protos.EventProtos.Event.Exception parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.github.kornilova_l.protos.EventProtos.Event.Exception) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private com.github.kornilova_l.protos.EventProtos.Event.Object object_ = null;
        private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Object, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder, com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder> objectBuilder_;
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public boolean hasObject() {
          return objectBuilder_ != null || object_ != null;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Object getObject() {
          if (objectBuilder_ == null) {
            return object_ == null ? com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance() : object_;
          } else {
            return objectBuilder_.getMessage();
          }
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public Builder setObject(com.github.kornilova_l.protos.EventProtos.Event.Object value) {
          if (objectBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            object_ = value;
            onChanged();
          } else {
            objectBuilder_.setMessage(value);
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public Builder setObject(
            com.github.kornilova_l.protos.EventProtos.Event.Object.Builder builderForValue) {
          if (objectBuilder_ == null) {
            object_ = builderForValue.build();
            onChanged();
          } else {
            objectBuilder_.setMessage(builderForValue.build());
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public Builder mergeObject(com.github.kornilova_l.protos.EventProtos.Event.Object value) {
          if (objectBuilder_ == null) {
            if (object_ != null) {
              object_ =
                com.github.kornilova_l.protos.EventProtos.Event.Object.newBuilder(object_).mergeFrom(value).buildPartial();
            } else {
              object_ = value;
            }
            onChanged();
          } else {
            objectBuilder_.mergeFrom(value);
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public Builder clearObject() {
          if (objectBuilder_ == null) {
            object_ = null;
            onChanged();
          } else {
            object_ = null;
            objectBuilder_ = null;
          }

          return this;
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Object.Builder getObjectBuilder() {

          onChanged();
          return getObjectFieldBuilder().getBuilder();
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder getObjectOrBuilder() {
          if (objectBuilder_ != null) {
            return objectBuilder_.getMessageOrBuilder();
          } else {
            return object_ == null ?
                com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance() : object_;
          }
        }
        /**
         * <code>.com.github.kornilova_l.protos.Event.Object object = 1;</code>
         */
        private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Object, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder, com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder>
            getObjectFieldBuilder() {
          if (objectBuilder_ == null) {
            objectBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
                com.github.kornilova_l.protos.EventProtos.Event.Object, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder, com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder>(
                    getObject(),
                    getParentForChildren(),
                    isClean());
            object_ = null;
          }
          return objectBuilder_;
        }
        public final Builder setUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }

        public final Builder mergeUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }


        // @@protoc_insertion_point(builder_scope:com.github.kornilova_l.protos.Event.Exception)
      }

      // @@protoc_insertion_point(class_scope:com.github.kornilova_l.protos.Event.Exception)
      private static final com.github.kornilova_l.protos.EventProtos.Event.Exception DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new com.github.kornilova_l.protos.EventProtos.Event.Exception();
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Exception getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.github.kornilova_l.libs.com.google.protobuf.Parser<Exception>
          PARSER = new com.github.kornilova_l.libs.com.google.protobuf.AbstractParser<Exception>() {
        public Exception parsePartialFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
            return new Exception(input, extensionRegistry);
        }
      };

      public static com.github.kornilova_l.libs.com.google.protobuf.Parser<Exception> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.github.kornilova_l.libs.com.google.protobuf.Parser<Exception> getParserForType() {
        return PARSER;
      }

      public com.github.kornilova_l.protos.EventProtos.Event.Exception getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface VarOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.github.kornilova_l.protos.Event.Var)
        com.github.kornilova_l.libs.com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * int
       * </pre>
       *
       * <code>sint32 I = 1;</code>
       */
      int getI();

      /**
       * <pre>
       * long
       * </pre>
       *
       * <code>sint64 J = 2;</code>
       */
      long getJ();

      /**
       * <pre>
       * boolean
       * </pre>
       *
       * <code>bool Z = 3;</code>
       */
      boolean getZ();

      /**
       * <pre>
       * char
       * </pre>
       *
       * <code>uint32 C = 4;</code>
       */
      int getC();

      /**
       * <pre>
       * short
       * </pre>
       *
       * <code>sint32 S = 5;</code>
       */
      int getS();

      /**
       * <pre>
       * byte
       * </pre>
       *
       * <code>sint32 B = 6;</code>
       */
      int getB();

      /**
       * <pre>
       * float
       * </pre>
       *
       * <code>float F = 7;</code>
       */
      float getF();

      /**
       * <pre>
       * double
       * </pre>
       *
       * <code>double D = 8;</code>
       */
      double getD();

      /**
       * <pre>
       * object
       * </pre>
       *
       * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.Object getObject();
      /**
       * <pre>
       * object
       * </pre>
       *
       * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
       */
      com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder getObjectOrBuilder();

      public com.github.kornilova_l.protos.EventProtos.Event.Var.ValueCase getValueCase();
    }
    /**
     * Protobuf type {@code com.github.kornilova_l.protos.Event.Var}
     */
    public  static final class Var extends
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.github.kornilova_l.protos.Event.Var)
        VarOrBuilder {
      // Use Var.newBuilder() to construct.
      private Var(com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Var() {
      }

      @java.lang.Override
      public final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private Var(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {
                valueCase_ = 1;
                value_ = input.readSInt32();
                break;
              }
              case 16: {
                valueCase_ = 2;
                value_ = input.readSInt64();
                break;
              }
              case 24: {
                valueCase_ = 3;
                value_ = input.readBool();
                break;
              }
              case 32: {
                valueCase_ = 4;
                value_ = input.readUInt32();
                break;
              }
              case 40: {
                valueCase_ = 5;
                value_ = input.readSInt32();
                break;
              }
              case 48: {
                valueCase_ = 6;
                value_ = input.readSInt32();
                break;
              }
              case 61: {
                valueCase_ = 7;
                value_ = input.readFloat();
                break;
              }
              case 65: {
                valueCase_ = 8;
                value_ = input.readDouble();
                break;
              }
              case 74: {
                com.github.kornilova_l.protos.EventProtos.Event.Object.Builder subBuilder = null;
                if (valueCase_ == 9) {
                  subBuilder = ((com.github.kornilova_l.protos.EventProtos.Event.Object) value_).toBuilder();
                }
                value_ =
                    input.readMessage(com.github.kornilova_l.protos.EventProtos.Event.Object.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Object) value_);
                  value_ = subBuilder.buildPartial();
                }
                valueCase_ = 9;
                break;
              }
            }
          }
        } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          makeExtensionsImmutable();
        }
      }
      public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Var_descriptor;
      }

      protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Var_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.kornilova_l.protos.EventProtos.Event.Var.class, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder.class);
      }

      private int valueCase_ = 0;
      private java.lang.Object value_;
      public enum ValueCase
          implements com.github.kornilova_l.libs.com.google.protobuf.Internal.EnumLite {
        I(1),
        J(2),
        Z(3),
        C(4),
        S(5),
        B(6),
        F(7),
        D(8),
        OBJECT(9),
        VALUE_NOT_SET(0);
        private final int value;
        private ValueCase(int value) {
          this.value = value;
        }
        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static ValueCase valueOf(int value) {
          return forNumber(value);
        }

        public static ValueCase forNumber(int value) {
          switch (value) {
            case 1: return I;
            case 2: return J;
            case 3: return Z;
            case 4: return C;
            case 5: return S;
            case 6: return B;
            case 7: return F;
            case 8: return D;
            case 9: return OBJECT;
            case 0: return VALUE_NOT_SET;
            default: return null;
          }
        }
        public int getNumber() {
          return this.value;
        }
      };

      public ValueCase
      getValueCase() {
        return ValueCase.forNumber(
            valueCase_);
      }

      public static final int I_FIELD_NUMBER = 1;
      /**
       * <pre>
       * int
       * </pre>
       *
       * <code>sint32 I = 1;</code>
       */
      public int getI() {
        if (valueCase_ == 1) {
          return (java.lang.Integer) value_;
        }
        return 0;
      }

      public static final int J_FIELD_NUMBER = 2;
      /**
       * <pre>
       * long
       * </pre>
       *
       * <code>sint64 J = 2;</code>
       */
      public long getJ() {
        if (valueCase_ == 2) {
          return (java.lang.Long) value_;
        }
        return 0L;
      }

      public static final int Z_FIELD_NUMBER = 3;
      /**
       * <pre>
       * boolean
       * </pre>
       *
       * <code>bool Z = 3;</code>
       */
      public boolean getZ() {
        if (valueCase_ == 3) {
          return (java.lang.Boolean) value_;
        }
        return false;
      }

      public static final int C_FIELD_NUMBER = 4;
      /**
       * <pre>
       * char
       * </pre>
       *
       * <code>uint32 C = 4;</code>
       */
      public int getC() {
        if (valueCase_ == 4) {
          return (java.lang.Integer) value_;
        }
        return 0;
      }

      public static final int S_FIELD_NUMBER = 5;
      /**
       * <pre>
       * short
       * </pre>
       *
       * <code>sint32 S = 5;</code>
       */
      public int getS() {
        if (valueCase_ == 5) {
          return (java.lang.Integer) value_;
        }
        return 0;
      }

      public static final int B_FIELD_NUMBER = 6;
      /**
       * <pre>
       * byte
       * </pre>
       *
       * <code>sint32 B = 6;</code>
       */
      public int getB() {
        if (valueCase_ == 6) {
          return (java.lang.Integer) value_;
        }
        return 0;
      }

      public static final int F_FIELD_NUMBER = 7;
      /**
       * <pre>
       * float
       * </pre>
       *
       * <code>float F = 7;</code>
       */
      public float getF() {
        if (valueCase_ == 7) {
          return (java.lang.Float) value_;
        }
        return 0F;
      }

      public static final int D_FIELD_NUMBER = 8;
      /**
       * <pre>
       * double
       * </pre>
       *
       * <code>double D = 8;</code>
       */
      public double getD() {
        if (valueCase_ == 8) {
          return (java.lang.Double) value_;
        }
        return 0D;
      }

      public static final int OBJECT_FIELD_NUMBER = 9;
      /**
       * <pre>
       * object
       * </pre>
       *
       * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Object getObject() {
        if (valueCase_ == 9) {
           return (com.github.kornilova_l.protos.EventProtos.Event.Object) value_;
        }
        return com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
      }
      /**
       * <pre>
       * object
       * </pre>
       *
       * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder getObjectOrBuilder() {
        if (valueCase_ == 9) {
           return (com.github.kornilova_l.protos.EventProtos.Event.Object) value_;
        }
        return com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (valueCase_ == 1) {
          output.writeSInt32(
              1, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 2) {
          output.writeSInt64(
              2, (long)((java.lang.Long) value_));
        }
        if (valueCase_ == 3) {
          output.writeBool(
              3, (boolean)((java.lang.Boolean) value_));
        }
        if (valueCase_ == 4) {
          output.writeUInt32(
              4, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 5) {
          output.writeSInt32(
              5, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 6) {
          output.writeSInt32(
              6, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 7) {
          output.writeFloat(
              7, (float)((java.lang.Float) value_));
        }
        if (valueCase_ == 8) {
          output.writeDouble(
              8, (double)((java.lang.Double) value_));
        }
        if (valueCase_ == 9) {
          output.writeMessage(9, (com.github.kornilova_l.protos.EventProtos.Event.Object) value_);
        }
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (valueCase_ == 1) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeSInt32Size(
                1, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 2) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeSInt64Size(
                2, (long)((java.lang.Long) value_));
        }
        if (valueCase_ == 3) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeBoolSize(
                3, (boolean)((java.lang.Boolean) value_));
        }
        if (valueCase_ == 4) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeUInt32Size(
                4, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 5) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeSInt32Size(
                5, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 6) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeSInt32Size(
                6, (int)((java.lang.Integer) value_));
        }
        if (valueCase_ == 7) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeFloatSize(
                7, (float)((java.lang.Float) value_));
        }
        if (valueCase_ == 8) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeDoubleSize(
                8, (double)((java.lang.Double) value_));
        }
        if (valueCase_ == 9) {
          size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
            .computeMessageSize(9, (com.github.kornilova_l.protos.EventProtos.Event.Object) value_);
        }
        memoizedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof com.github.kornilova_l.protos.EventProtos.Event.Var)) {
          return super.equals(obj);
        }
        com.github.kornilova_l.protos.EventProtos.Event.Var other = (com.github.kornilova_l.protos.EventProtos.Event.Var) obj;

        boolean result = true;
        result = result && getValueCase().equals(
            other.getValueCase());
        if (!result) return false;
        switch (valueCase_) {
          case 1:
            result = result && (getI()
                == other.getI());
            break;
          case 2:
            result = result && (getJ()
                == other.getJ());
            break;
          case 3:
            result = result && (getZ()
                == other.getZ());
            break;
          case 4:
            result = result && (getC()
                == other.getC());
            break;
          case 5:
            result = result && (getS()
                == other.getS());
            break;
          case 6:
            result = result && (getB()
                == other.getB());
            break;
          case 7:
            result = result && (
                java.lang.Float.floatToIntBits(getF())
                == java.lang.Float.floatToIntBits(
                    other.getF()));
            break;
          case 8:
            result = result && (
                java.lang.Double.doubleToLongBits(getD())
                == java.lang.Double.doubleToLongBits(
                    other.getD()));
            break;
          case 9:
            result = result && getObject()
                .equals(other.getObject());
            break;
          case 0:
          default:
        }
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        switch (valueCase_) {
          case 1:
            hash = (37 * hash) + I_FIELD_NUMBER;
            hash = (53 * hash) + getI();
            break;
          case 2:
            hash = (37 * hash) + J_FIELD_NUMBER;
            hash = (53 * hash) + com.github.kornilova_l.libs.com.google.protobuf.Internal.hashLong(
                getJ());
            break;
          case 3:
            hash = (37 * hash) + Z_FIELD_NUMBER;
            hash = (53 * hash) + com.github.kornilova_l.libs.com.google.protobuf.Internal.hashBoolean(
                getZ());
            break;
          case 4:
            hash = (37 * hash) + C_FIELD_NUMBER;
            hash = (53 * hash) + getC();
            break;
          case 5:
            hash = (37 * hash) + S_FIELD_NUMBER;
            hash = (53 * hash) + getS();
            break;
          case 6:
            hash = (37 * hash) + B_FIELD_NUMBER;
            hash = (53 * hash) + getB();
            break;
          case 7:
            hash = (37 * hash) + F_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                getF());
            break;
          case 8:
            hash = (37 * hash) + D_FIELD_NUMBER;
            hash = (53 * hash) + com.github.kornilova_l.libs.com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getD()));
            break;
          case 9:
            hash = (37 * hash) + OBJECT_FIELD_NUMBER;
            hash = (53 * hash) + getObject().hashCode();
            break;
          case 0:
          default:
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          java.nio.ByteBuffer data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          java.nio.ByteBuffer data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(byte[] data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          byte[] data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseDelimitedFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Var parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(com.github.kornilova_l.protos.EventProtos.Event.Var prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code com.github.kornilova_l.protos.Event.Var}
       */
      public static final class Builder extends
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.github.kornilova_l.protos.Event.Var)
          com.github.kornilova_l.protos.EventProtos.Event.VarOrBuilder {
        public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Var_descriptor;
        }

        protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Var_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.github.kornilova_l.protos.EventProtos.Event.Var.class, com.github.kornilova_l.protos.EventProtos.Event.Var.Builder.class);
        }

        // Construct using com.github.kornilova_l.protos.EventProtos.Event.Var.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        public Builder clear() {
          super.clear();
          valueCase_ = 0;
          value_ = null;
          return this;
        }

        public com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Var_descriptor;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Var getDefaultInstanceForType() {
          return com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance();
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Var build() {
          com.github.kornilova_l.protos.EventProtos.Event.Var result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Var buildPartial() {
          com.github.kornilova_l.protos.EventProtos.Event.Var result = new com.github.kornilova_l.protos.EventProtos.Event.Var(this);
          if (valueCase_ == 1) {
            result.value_ = value_;
          }
          if (valueCase_ == 2) {
            result.value_ = value_;
          }
          if (valueCase_ == 3) {
            result.value_ = value_;
          }
          if (valueCase_ == 4) {
            result.value_ = value_;
          }
          if (valueCase_ == 5) {
            result.value_ = value_;
          }
          if (valueCase_ == 6) {
            result.value_ = value_;
          }
          if (valueCase_ == 7) {
            result.value_ = value_;
          }
          if (valueCase_ == 8) {
            result.value_ = value_;
          }
          if (valueCase_ == 9) {
            if (objectBuilder_ == null) {
              result.value_ = value_;
            } else {
              result.value_ = objectBuilder_.build();
            }
          }
          result.valueCase_ = valueCase_;
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.github.kornilova_l.libs.com.google.protobuf.Message other) {
          if (other instanceof com.github.kornilova_l.protos.EventProtos.Event.Var) {
            return mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Var)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.github.kornilova_l.protos.EventProtos.Event.Var other) {
          if (other == com.github.kornilova_l.protos.EventProtos.Event.Var.getDefaultInstance()) return this;
          switch (other.getValueCase()) {
            case I: {
              setI(other.getI());
              break;
            }
            case J: {
              setJ(other.getJ());
              break;
            }
            case Z: {
              setZ(other.getZ());
              break;
            }
            case C: {
              setC(other.getC());
              break;
            }
            case S: {
              setS(other.getS());
              break;
            }
            case B: {
              setB(other.getB());
              break;
            }
            case F: {
              setF(other.getF());
              break;
            }
            case D: {
              setD(other.getD());
              break;
            }
            case OBJECT: {
              mergeObject(other.getObject());
              break;
            }
            case VALUE_NOT_SET: {
              break;
            }
          }
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          return true;
        }

        public Builder mergeFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.github.kornilova_l.protos.EventProtos.Event.Var parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.github.kornilova_l.protos.EventProtos.Event.Var) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int valueCase_ = 0;
        private java.lang.Object value_;
        public ValueCase
            getValueCase() {
          return ValueCase.forNumber(
              valueCase_);
        }

        public Builder clearValue() {
          valueCase_ = 0;
          value_ = null;
          onChanged();
          return this;
        }


        /**
         * <pre>
         * int
         * </pre>
         *
         * <code>sint32 I = 1;</code>
         */
        public int getI() {
          if (valueCase_ == 1) {
            return (java.lang.Integer) value_;
          }
          return 0;
        }
        /**
         * <pre>
         * int
         * </pre>
         *
         * <code>sint32 I = 1;</code>
         */
        public Builder setI(int value) {
          valueCase_ = 1;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * int
         * </pre>
         *
         * <code>sint32 I = 1;</code>
         */
        public Builder clearI() {
          if (valueCase_ == 1) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * long
         * </pre>
         *
         * <code>sint64 J = 2;</code>
         */
        public long getJ() {
          if (valueCase_ == 2) {
            return (java.lang.Long) value_;
          }
          return 0L;
        }
        /**
         * <pre>
         * long
         * </pre>
         *
         * <code>sint64 J = 2;</code>
         */
        public Builder setJ(long value) {
          valueCase_ = 2;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * long
         * </pre>
         *
         * <code>sint64 J = 2;</code>
         */
        public Builder clearJ() {
          if (valueCase_ == 2) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * boolean
         * </pre>
         *
         * <code>bool Z = 3;</code>
         */
        public boolean getZ() {
          if (valueCase_ == 3) {
            return (java.lang.Boolean) value_;
          }
          return false;
        }
        /**
         * <pre>
         * boolean
         * </pre>
         *
         * <code>bool Z = 3;</code>
         */
        public Builder setZ(boolean value) {
          valueCase_ = 3;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * boolean
         * </pre>
         *
         * <code>bool Z = 3;</code>
         */
        public Builder clearZ() {
          if (valueCase_ == 3) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * char
         * </pre>
         *
         * <code>uint32 C = 4;</code>
         */
        public int getC() {
          if (valueCase_ == 4) {
            return (java.lang.Integer) value_;
          }
          return 0;
        }
        /**
         * <pre>
         * char
         * </pre>
         *
         * <code>uint32 C = 4;</code>
         */
        public Builder setC(int value) {
          valueCase_ = 4;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * char
         * </pre>
         *
         * <code>uint32 C = 4;</code>
         */
        public Builder clearC() {
          if (valueCase_ == 4) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * short
         * </pre>
         *
         * <code>sint32 S = 5;</code>
         */
        public int getS() {
          if (valueCase_ == 5) {
            return (java.lang.Integer) value_;
          }
          return 0;
        }
        /**
         * <pre>
         * short
         * </pre>
         *
         * <code>sint32 S = 5;</code>
         */
        public Builder setS(int value) {
          valueCase_ = 5;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * short
         * </pre>
         *
         * <code>sint32 S = 5;</code>
         */
        public Builder clearS() {
          if (valueCase_ == 5) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * byte
         * </pre>
         *
         * <code>sint32 B = 6;</code>
         */
        public int getB() {
          if (valueCase_ == 6) {
            return (java.lang.Integer) value_;
          }
          return 0;
        }
        /**
         * <pre>
         * byte
         * </pre>
         *
         * <code>sint32 B = 6;</code>
         */
        public Builder setB(int value) {
          valueCase_ = 6;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * byte
         * </pre>
         *
         * <code>sint32 B = 6;</code>
         */
        public Builder clearB() {
          if (valueCase_ == 6) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * float
         * </pre>
         *
         * <code>float F = 7;</code>
         */
        public float getF() {
          if (valueCase_ == 7) {
            return (java.lang.Float) value_;
          }
          return 0F;
        }
        /**
         * <pre>
         * float
         * </pre>
         *
         * <code>float F = 7;</code>
         */
        public Builder setF(float value) {
          valueCase_ = 7;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * float
         * </pre>
         *
         * <code>float F = 7;</code>
         */
        public Builder clearF() {
          if (valueCase_ == 7) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * double
         * </pre>
         *
         * <code>double D = 8;</code>
         */
        public double getD() {
          if (valueCase_ == 8) {
            return (java.lang.Double) value_;
          }
          return 0D;
        }
        /**
         * <pre>
         * double
         * </pre>
         *
         * <code>double D = 8;</code>
         */
        public Builder setD(double value) {
          valueCase_ = 8;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * double
         * </pre>
         *
         * <code>double D = 8;</code>
         */
        public Builder clearD() {
          if (valueCase_ == 8) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Object, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder, com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder> objectBuilder_;
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Object getObject() {
          if (objectBuilder_ == null) {
            if (valueCase_ == 9) {
              return (com.github.kornilova_l.protos.EventProtos.Event.Object) value_;
            }
            return com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
          } else {
            if (valueCase_ == 9) {
              return objectBuilder_.getMessage();
            }
            return com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
          }
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public Builder setObject(com.github.kornilova_l.protos.EventProtos.Event.Object value) {
          if (objectBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            value_ = value;
            onChanged();
          } else {
            objectBuilder_.setMessage(value);
          }
          valueCase_ = 9;
          return this;
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public Builder setObject(
            com.github.kornilova_l.protos.EventProtos.Event.Object.Builder builderForValue) {
          if (objectBuilder_ == null) {
            value_ = builderForValue.build();
            onChanged();
          } else {
            objectBuilder_.setMessage(builderForValue.build());
          }
          valueCase_ = 9;
          return this;
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public Builder mergeObject(com.github.kornilova_l.protos.EventProtos.Event.Object value) {
          if (objectBuilder_ == null) {
            if (valueCase_ == 9 &&
                value_ != com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance()) {
              value_ = com.github.kornilova_l.protos.EventProtos.Event.Object.newBuilder((com.github.kornilova_l.protos.EventProtos.Event.Object) value_)
                  .mergeFrom(value).buildPartial();
            } else {
              value_ = value;
            }
            onChanged();
          } else {
            if (valueCase_ == 9) {
              objectBuilder_.mergeFrom(value);
            }
            objectBuilder_.setMessage(value);
          }
          valueCase_ = 9;
          return this;
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public Builder clearObject() {
          if (objectBuilder_ == null) {
            if (valueCase_ == 9) {
              valueCase_ = 0;
              value_ = null;
              onChanged();
            }
          } else {
            if (valueCase_ == 9) {
              valueCase_ = 0;
              value_ = null;
            }
            objectBuilder_.clear();
          }
          return this;
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.Object.Builder getObjectBuilder() {
          return getObjectFieldBuilder().getBuilder();
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        public com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder getObjectOrBuilder() {
          if ((valueCase_ == 9) && (objectBuilder_ != null)) {
            return objectBuilder_.getMessageOrBuilder();
          } else {
            if (valueCase_ == 9) {
              return (com.github.kornilova_l.protos.EventProtos.Event.Object) value_;
            }
            return com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
          }
        }
        /**
         * <pre>
         * object
         * </pre>
         *
         * <code>.com.github.kornilova_l.protos.Event.Object object = 9;</code>
         */
        private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
            com.github.kornilova_l.protos.EventProtos.Event.Object, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder, com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder>
            getObjectFieldBuilder() {
          if (objectBuilder_ == null) {
            if (!(valueCase_ == 9)) {
              value_ = com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
            }
            objectBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
                com.github.kornilova_l.protos.EventProtos.Event.Object, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder, com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder>(
                    (com.github.kornilova_l.protos.EventProtos.Event.Object) value_,
                    getParentForChildren(),
                    isClean());
            value_ = null;
          }
          valueCase_ = 9;
          onChanged();;
          return objectBuilder_;
        }
        public final Builder setUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }

        public final Builder mergeUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }


        // @@protoc_insertion_point(builder_scope:com.github.kornilova_l.protos.Event.Var)
      }

      // @@protoc_insertion_point(class_scope:com.github.kornilova_l.protos.Event.Var)
      private static final com.github.kornilova_l.protos.EventProtos.Event.Var DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new com.github.kornilova_l.protos.EventProtos.Event.Var();
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Var getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.github.kornilova_l.libs.com.google.protobuf.Parser<Var>
          PARSER = new com.github.kornilova_l.libs.com.google.protobuf.AbstractParser<Var>() {
        public Var parsePartialFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
            return new Var(input, extensionRegistry);
        }
      };

      public static com.github.kornilova_l.libs.com.google.protobuf.Parser<Var> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.github.kornilova_l.libs.com.google.protobuf.Parser<Var> getParserForType() {
        return PARSER;
      }

      public com.github.kornilova_l.protos.EventProtos.Event.Var getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface ObjectOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.github.kornilova_l.protos.Event.Object)
        com.github.kornilova_l.libs.com.google.protobuf.MessageOrBuilder {

      /**
       * <code>string type = 1;</code>
       */
      java.lang.String getType();
      /**
       * <code>string type = 1;</code>
       */
      com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getTypeBytes();

      /**
       * <code>string value = 2;</code>
       */
      java.lang.String getValue();
      /**
       * <code>string value = 2;</code>
       */
      com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getValueBytes();
    }
    /**
     * Protobuf type {@code com.github.kornilova_l.protos.Event.Object}
     */
    public  static final class Object extends
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.github.kornilova_l.protos.Event.Object)
        ObjectOrBuilder {
      // Use Object.newBuilder() to construct.
      private Object(com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Object() {
        type_ = "";
        value_ = "";
      }

      @java.lang.Override
      public final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }
      private Object(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                java.lang.String s = input.readStringRequireUtf8();

                type_ = s;
                break;
              }
              case 18: {
                java.lang.String s = input.readStringRequireUtf8();

                value_ = s;
                break;
              }
            }
          }
        } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          makeExtensionsImmutable();
        }
      }
      public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Object_descriptor;
      }

      protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Object_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.kornilova_l.protos.EventProtos.Event.Object.class, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder.class);
      }

      public static final int TYPE_FIELD_NUMBER = 1;
      private volatile java.lang.Object type_;
      /**
       * <code>string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
              (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        }
      }
      /**
       * <code>string type = 1;</code>
       */
      public com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof java.lang.String) {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
              com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
        }
      }

      public static final int VALUE_FIELD_NUMBER = 2;
      private volatile java.lang.Object value_;
      /**
       * <code>string value = 2;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
              (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        }
      }
      /**
       * <code>string value = 2;</code>
       */
      public com.github.kornilova_l.libs.com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof java.lang.String) {
          com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
              com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (!getTypeBytes().isEmpty()) {
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
        }
        if (!getValueBytes().isEmpty()) {
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
        }
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getTypeBytes().isEmpty()) {
          size += com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
        }
        if (!getValueBytes().isEmpty()) {
          size += com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
        }
        memoizedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;
      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof com.github.kornilova_l.protos.EventProtos.Event.Object)) {
          return super.equals(obj);
        }
        com.github.kornilova_l.protos.EventProtos.Event.Object other = (com.github.kornilova_l.protos.EventProtos.Event.Object) obj;

        boolean result = true;
        result = result && getType()
            .equals(other.getType());
        result = result && getValue()
            .equals(other.getValue());
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          java.nio.ByteBuffer data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          java.nio.ByteBuffer data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.ByteString data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(byte[] data)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          byte[] data,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseDelimitedFrom(
          java.io.InputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static com.github.kornilova_l.protos.EventProtos.Event.Object parseFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(com.github.kornilova_l.protos.EventProtos.Event.Object prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code com.github.kornilova_l.protos.Event.Object}
       */
      public static final class Builder extends
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.github.kornilova_l.protos.Event.Object)
          com.github.kornilova_l.protos.EventProtos.Event.ObjectOrBuilder {
        public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Object_descriptor;
        }

        protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Object_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.github.kornilova_l.protos.EventProtos.Event.Object.class, com.github.kornilova_l.protos.EventProtos.Event.Object.Builder.class);
        }

        // Construct using com.github.kornilova_l.protos.EventProtos.Event.Object.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        public Builder clear() {
          super.clear();
          type_ = "";

          value_ = "";

          return this;
        }

        public com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_Object_descriptor;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Object getDefaultInstanceForType() {
          return com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance();
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Object build() {
          com.github.kornilova_l.protos.EventProtos.Event.Object result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public com.github.kornilova_l.protos.EventProtos.Event.Object buildPartial() {
          com.github.kornilova_l.protos.EventProtos.Event.Object result = new com.github.kornilova_l.protos.EventProtos.Event.Object(this);
          result.type_ = type_;
          result.value_ = value_;
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.github.kornilova_l.libs.com.google.protobuf.Message other) {
          if (other instanceof com.github.kornilova_l.protos.EventProtos.Event.Object) {
            return mergeFrom((com.github.kornilova_l.protos.EventProtos.Event.Object)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(com.github.kornilova_l.protos.EventProtos.Event.Object other) {
          if (other == com.github.kornilova_l.protos.EventProtos.Event.Object.getDefaultInstance()) return this;
          if (!other.getType().isEmpty()) {
            type_ = other.type_;
            onChanged();
          }
          if (!other.getValue().isEmpty()) {
            value_ = other.value_;
            onChanged();
          }
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          return true;
        }

        public Builder mergeFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.github.kornilova_l.protos.EventProtos.Event.Object parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.github.kornilova_l.protos.EventProtos.Event.Object) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private java.lang.Object type_ = "";
        /**
         * <code>string type = 1;</code>
         */
        public java.lang.String getType() {
          java.lang.Object ref = type_;
          if (!(ref instanceof java.lang.String)) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
                (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            type_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>string type = 1;</code>
         */
        public com.github.kornilova_l.libs.com.google.protobuf.ByteString
            getTypeBytes() {
          java.lang.Object ref = type_;
          if (ref instanceof String) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
                com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            type_ = b;
            return b;
          } else {
            return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string type = 1;</code>
         */
        public Builder setType(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }

          type_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string type = 1;</code>
         */
        public Builder clearType() {

          type_ = getDefaultInstance().getType();
          onChanged();
          return this;
        }
        /**
         * <code>string type = 1;</code>
         */
        public Builder setTypeBytes(
            com.github.kornilova_l.libs.com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

          type_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object value_ = "";
        /**
         * <code>string value = 2;</code>
         */
        public java.lang.String getValue() {
          java.lang.Object ref = value_;
          if (!(ref instanceof java.lang.String)) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString bs =
                (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            value_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>string value = 2;</code>
         */
        public com.github.kornilova_l.libs.com.google.protobuf.ByteString
            getValueBytes() {
          java.lang.Object ref = value_;
          if (ref instanceof String) {
            com.github.kornilova_l.libs.com.google.protobuf.ByteString b =
                com.github.kornilova_l.libs.com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            value_ = b;
            return b;
          } else {
            return (com.github.kornilova_l.libs.com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>string value = 2;</code>
         */
        public Builder setValue(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }

          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>string value = 2;</code>
         */
        public Builder clearValue() {

          value_ = getDefaultInstance().getValue();
          onChanged();
          return this;
        }
        /**
         * <code>string value = 2;</code>
         */
        public Builder setValueBytes(
            com.github.kornilova_l.libs.com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

          value_ = value;
          onChanged();
          return this;
        }
        public final Builder setUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }

        public final Builder mergeUnknownFields(
            final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
          return this;
        }


        // @@protoc_insertion_point(builder_scope:com.github.kornilova_l.protos.Event.Object)
      }

      // @@protoc_insertion_point(class_scope:com.github.kornilova_l.protos.Event.Object)
      private static final com.github.kornilova_l.protos.EventProtos.Event.Object DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new com.github.kornilova_l.protos.EventProtos.Event.Object();
      }

      public static com.github.kornilova_l.protos.EventProtos.Event.Object getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.github.kornilova_l.libs.com.google.protobuf.Parser<Object>
          PARSER = new com.github.kornilova_l.libs.com.google.protobuf.AbstractParser<Object>() {
        public Object parsePartialFrom(
            com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
            com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
            return new Object(input, extensionRegistry);
        }
      };

      public static com.github.kornilova_l.libs.com.google.protobuf.Parser<Object> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.github.kornilova_l.libs.com.google.protobuf.Parser<Object> getParserForType() {
        return PARSER;
      }

      public com.github.kornilova_l.protos.EventProtos.Event.Object getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int infoCase_ = 0;
    private java.lang.Object info_;
    public enum InfoCase
        implements com.github.kornilova_l.libs.com.google.protobuf.Internal.EnumLite {
      ENTER(3),
      EXIT(4),
      EXCEPTION(5),
      INFO_NOT_SET(0);
      private final int value;
      private InfoCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static InfoCase valueOf(int value) {
        return forNumber(value);
      }

      public static InfoCase forNumber(int value) {
        switch (value) {
          case 3: return ENTER;
          case 4: return EXIT;
          case 5: return EXCEPTION;
          case 0: return INFO_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public InfoCase
    getInfoCase() {
      return InfoCase.forNumber(
          infoCase_);
    }

    public static final int THREAD_ID_FIELD_NUMBER = 1;
    private long threadId_;
    /**
     * <code>int64 thread_id = 1;</code>
     */
    public long getThreadId() {
      return threadId_;
    }

    public static final int TIME_FIELD_NUMBER = 2;
    private long time_;
    /**
     * <code>int64 time = 2;</code>
     */
    public long getTime() {
      return time_;
    }

    public static final int ENTER_FIELD_NUMBER = 3;
    /**
     * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
     */
    public com.github.kornilova_l.protos.EventProtos.Event.Enter getEnter() {
      if (infoCase_ == 3) {
         return (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_;
      }
      return com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
    }
    /**
     * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
     */
    public com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder getEnterOrBuilder() {
      if (infoCase_ == 3) {
         return (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_;
      }
      return com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
    }

    public static final int EXIT_FIELD_NUMBER = 4;
    /**
     * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
     */
    public com.github.kornilova_l.protos.EventProtos.Event.Exit getExit() {
      if (infoCase_ == 4) {
         return (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_;
      }
      return com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
    }
    /**
     * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
     */
    public com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder getExitOrBuilder() {
      if (infoCase_ == 4) {
         return (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_;
      }
      return com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
    }

    public static final int EXCEPTION_FIELD_NUMBER = 5;
    /**
     * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
     */
    public com.github.kornilova_l.protos.EventProtos.Event.Exception getException() {
      if (infoCase_ == 5) {
         return (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_;
      }
      return com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
    }
    /**
     * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
     */
    public com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder getExceptionOrBuilder() {
      if (infoCase_ == 5) {
         return (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_;
      }
      return com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (threadId_ != 0L) {
        output.writeInt64(1, threadId_);
      }
      if (time_ != 0L) {
        output.writeInt64(2, time_);
      }
      if (infoCase_ == 3) {
        output.writeMessage(3, (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_);
      }
      if (infoCase_ == 4) {
        output.writeMessage(4, (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_);
      }
      if (infoCase_ == 5) {
        output.writeMessage(5, (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (threadId_ != 0L) {
        size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, threadId_);
      }
      if (time_ != 0L) {
        size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, time_);
      }
      if (infoCase_ == 3) {
        size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_);
      }
      if (infoCase_ == 4) {
        size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_);
      }
      if (infoCase_ == 5) {
        size += com.github.kornilova_l.libs.com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.github.kornilova_l.protos.EventProtos.Event)) {
        return super.equals(obj);
      }
      com.github.kornilova_l.protos.EventProtos.Event other = (com.github.kornilova_l.protos.EventProtos.Event) obj;

      boolean result = true;
      result = result && (getThreadId()
          == other.getThreadId());
      result = result && (getTime()
          == other.getTime());
      result = result && getInfoCase().equals(
          other.getInfoCase());
      if (!result) return false;
      switch (infoCase_) {
        case 3:
          result = result && getEnter()
              .equals(other.getEnter());
          break;
        case 4:
          result = result && getExit()
              .equals(other.getExit());
          break;
        case 5:
          result = result && getException()
              .equals(other.getException());
          break;
        case 0:
        default:
      }
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + THREAD_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.github.kornilova_l.libs.com.google.protobuf.Internal.hashLong(
          getThreadId());
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.github.kornilova_l.libs.com.google.protobuf.Internal.hashLong(
          getTime());
      switch (infoCase_) {
        case 3:
          hash = (37 * hash) + ENTER_FIELD_NUMBER;
          hash = (53 * hash) + getEnter().hashCode();
          break;
        case 4:
          hash = (37 * hash) + EXIT_FIELD_NUMBER;
          hash = (53 * hash) + getExit().hashCode();
          break;
        case 5:
          hash = (37 * hash) + EXCEPTION_FIELD_NUMBER;
          hash = (53 * hash) + getException().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        java.nio.ByteBuffer data)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        java.nio.ByteBuffer data,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        com.github.kornilova_l.libs.com.google.protobuf.ByteString data)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        com.github.kornilova_l.libs.com.google.protobuf.ByteString data,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(byte[] data)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        byte[] data,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        java.io.InputStream input,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseDelimitedFrom(
        java.io.InputStream input,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.github.kornilova_l.protos.EventProtos.Event parseFrom(
        com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
        com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.github.kornilova_l.protos.EventProtos.Event prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.github.kornilova_l.protos.Event}
     */
    public static final class Builder extends
        com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.github.kornilova_l.protos.Event)
        com.github.kornilova_l.protos.EventProtos.EventOrBuilder {
      public static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_descriptor;
      }

      protected com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.kornilova_l.protos.EventProtos.Event.class, com.github.kornilova_l.protos.EventProtos.Event.Builder.class);
      }

      // Construct using com.github.kornilova_l.protos.EventProtos.Event.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        threadId_ = 0L;

        time_ = 0L;

        infoCase_ = 0;
        info_ = null;
        return this;
      }

      public com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.kornilova_l.protos.EventProtos.internal_static_com_github_kornilova_l_protos_src_Event_descriptor;
      }

      public com.github.kornilova_l.protos.EventProtos.Event getDefaultInstanceForType() {
        return com.github.kornilova_l.protos.EventProtos.Event.getDefaultInstance();
      }

      public com.github.kornilova_l.protos.EventProtos.Event build() {
        com.github.kornilova_l.protos.EventProtos.Event result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.github.kornilova_l.protos.EventProtos.Event buildPartial() {
        com.github.kornilova_l.protos.EventProtos.Event result = new com.github.kornilova_l.protos.EventProtos.Event(this);
        result.threadId_ = threadId_;
        result.time_ = time_;
        if (infoCase_ == 3) {
          if (enterBuilder_ == null) {
            result.info_ = info_;
          } else {
            result.info_ = enterBuilder_.build();
          }
        }
        if (infoCase_ == 4) {
          if (exitBuilder_ == null) {
            result.info_ = info_;
          } else {
            result.info_ = exitBuilder_.build();
          }
        }
        if (infoCase_ == 5) {
          if (exceptionBuilder_ == null) {
            result.info_ = info_;
          } else {
            result.info_ = exceptionBuilder_.build();
          }
        }
        result.infoCase_ = infoCase_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.github.kornilova_l.libs.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.github.kornilova_l.libs.com.google.protobuf.Message other) {
        if (other instanceof com.github.kornilova_l.protos.EventProtos.Event) {
          return mergeFrom((com.github.kornilova_l.protos.EventProtos.Event)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.kornilova_l.protos.EventProtos.Event other) {
        if (other == com.github.kornilova_l.protos.EventProtos.Event.getDefaultInstance()) return this;
        if (other.getThreadId() != 0L) {
          setThreadId(other.getThreadId());
        }
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        switch (other.getInfoCase()) {
          case ENTER: {
            mergeEnter(other.getEnter());
            break;
          }
          case EXIT: {
            mergeExit(other.getExit());
            break;
          }
          case EXCEPTION: {
            mergeException(other.getException());
            break;
          }
          case INFO_NOT_SET: {
            break;
          }
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.kornilova_l.protos.EventProtos.Event parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.kornilova_l.protos.EventProtos.Event) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int infoCase_ = 0;
      private java.lang.Object info_;
      public InfoCase
          getInfoCase() {
        return InfoCase.forNumber(
            infoCase_);
      }

      public Builder clearInfo() {
        infoCase_ = 0;
        info_ = null;
        onChanged();
        return this;
      }


      private long threadId_ ;
      /**
       * <code>int64 thread_id = 1;</code>
       */
      public long getThreadId() {
        return threadId_;
      }
      /**
       * <code>int64 thread_id = 1;</code>
       */
      public Builder setThreadId(long value) {

        threadId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 thread_id = 1;</code>
       */
      public Builder clearThreadId() {

        threadId_ = 0L;
        onChanged();
        return this;
      }

      private long time_ ;
      /**
       * <code>int64 time = 2;</code>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>int64 time = 2;</code>
       */
      public Builder setTime(long value) {

        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 time = 2;</code>
       */
      public Builder clearTime() {

        time_ = 0L;
        onChanged();
        return this;
      }

      private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
          com.github.kornilova_l.protos.EventProtos.Event.Enter, com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder, com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder> enterBuilder_;
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Enter getEnter() {
        if (enterBuilder_ == null) {
          if (infoCase_ == 3) {
            return (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_;
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
        } else {
          if (infoCase_ == 3) {
            return enterBuilder_.getMessage();
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
        }
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public Builder setEnter(com.github.kornilova_l.protos.EventProtos.Event.Enter value) {
        if (enterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          enterBuilder_.setMessage(value);
        }
        infoCase_ = 3;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public Builder setEnter(
          com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder builderForValue) {
        if (enterBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          enterBuilder_.setMessage(builderForValue.build());
        }
        infoCase_ = 3;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public Builder mergeEnter(com.github.kornilova_l.protos.EventProtos.Event.Enter value) {
        if (enterBuilder_ == null) {
          if (infoCase_ == 3 &&
              info_ != com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance()) {
            info_ = com.github.kornilova_l.protos.EventProtos.Event.Enter.newBuilder((com.github.kornilova_l.protos.EventProtos.Event.Enter) info_)
                .mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          if (infoCase_ == 3) {
            enterBuilder_.mergeFrom(value);
          }
          enterBuilder_.setMessage(value);
        }
        infoCase_ = 3;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public Builder clearEnter() {
        if (enterBuilder_ == null) {
          if (infoCase_ == 3) {
            infoCase_ = 0;
            info_ = null;
            onChanged();
          }
        } else {
          if (infoCase_ == 3) {
            infoCase_ = 0;
            info_ = null;
          }
          enterBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder getEnterBuilder() {
        return getEnterFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder getEnterOrBuilder() {
        if ((infoCase_ == 3) && (enterBuilder_ != null)) {
          return enterBuilder_.getMessageOrBuilder();
        } else {
          if (infoCase_ == 3) {
            return (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_;
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
        }
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Enter enter = 3;</code>
       */
      private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
          com.github.kornilova_l.protos.EventProtos.Event.Enter, com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder, com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder>
          getEnterFieldBuilder() {
        if (enterBuilder_ == null) {
          if (!(infoCase_ == 3)) {
            info_ = com.github.kornilova_l.protos.EventProtos.Event.Enter.getDefaultInstance();
          }
          enterBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
              com.github.kornilova_l.protos.EventProtos.Event.Enter, com.github.kornilova_l.protos.EventProtos.Event.Enter.Builder, com.github.kornilova_l.protos.EventProtos.Event.EnterOrBuilder>(
                  (com.github.kornilova_l.protos.EventProtos.Event.Enter) info_,
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        infoCase_ = 3;
        onChanged();;
        return enterBuilder_;
      }

      private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
          com.github.kornilova_l.protos.EventProtos.Event.Exit, com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder, com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder> exitBuilder_;
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Exit getExit() {
        if (exitBuilder_ == null) {
          if (infoCase_ == 4) {
            return (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_;
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
        } else {
          if (infoCase_ == 4) {
            return exitBuilder_.getMessage();
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
        }
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public Builder setExit(com.github.kornilova_l.protos.EventProtos.Event.Exit value) {
        if (exitBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          exitBuilder_.setMessage(value);
        }
        infoCase_ = 4;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public Builder setExit(
          com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder builderForValue) {
        if (exitBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          exitBuilder_.setMessage(builderForValue.build());
        }
        infoCase_ = 4;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public Builder mergeExit(com.github.kornilova_l.protos.EventProtos.Event.Exit value) {
        if (exitBuilder_ == null) {
          if (infoCase_ == 4 &&
              info_ != com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance()) {
            info_ = com.github.kornilova_l.protos.EventProtos.Event.Exit.newBuilder((com.github.kornilova_l.protos.EventProtos.Event.Exit) info_)
                .mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          if (infoCase_ == 4) {
            exitBuilder_.mergeFrom(value);
          }
          exitBuilder_.setMessage(value);
        }
        infoCase_ = 4;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public Builder clearExit() {
        if (exitBuilder_ == null) {
          if (infoCase_ == 4) {
            infoCase_ = 0;
            info_ = null;
            onChanged();
          }
        } else {
          if (infoCase_ == 4) {
            infoCase_ = 0;
            info_ = null;
          }
          exitBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder getExitBuilder() {
        return getExitFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder getExitOrBuilder() {
        if ((infoCase_ == 4) && (exitBuilder_ != null)) {
          return exitBuilder_.getMessageOrBuilder();
        } else {
          if (infoCase_ == 4) {
            return (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_;
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
        }
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exit exit = 4;</code>
       */
      private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
          com.github.kornilova_l.protos.EventProtos.Event.Exit, com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder, com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder>
          getExitFieldBuilder() {
        if (exitBuilder_ == null) {
          if (!(infoCase_ == 4)) {
            info_ = com.github.kornilova_l.protos.EventProtos.Event.Exit.getDefaultInstance();
          }
          exitBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
              com.github.kornilova_l.protos.EventProtos.Event.Exit, com.github.kornilova_l.protos.EventProtos.Event.Exit.Builder, com.github.kornilova_l.protos.EventProtos.Event.ExitOrBuilder>(
                  (com.github.kornilova_l.protos.EventProtos.Event.Exit) info_,
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        infoCase_ = 4;
        onChanged();;
        return exitBuilder_;
      }

      private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
          com.github.kornilova_l.protos.EventProtos.Event.Exception, com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder, com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder> exceptionBuilder_;
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Exception getException() {
        if (exceptionBuilder_ == null) {
          if (infoCase_ == 5) {
            return (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_;
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
        } else {
          if (infoCase_ == 5) {
            return exceptionBuilder_.getMessage();
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
        }
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public Builder setException(com.github.kornilova_l.protos.EventProtos.Event.Exception value) {
        if (exceptionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          exceptionBuilder_.setMessage(value);
        }
        infoCase_ = 5;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public Builder setException(
          com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder builderForValue) {
        if (exceptionBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          exceptionBuilder_.setMessage(builderForValue.build());
        }
        infoCase_ = 5;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public Builder mergeException(com.github.kornilova_l.protos.EventProtos.Event.Exception value) {
        if (exceptionBuilder_ == null) {
          if (infoCase_ == 5 &&
              info_ != com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance()) {
            info_ = com.github.kornilova_l.protos.EventProtos.Event.Exception.newBuilder((com.github.kornilova_l.protos.EventProtos.Event.Exception) info_)
                .mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          if (infoCase_ == 5) {
            exceptionBuilder_.mergeFrom(value);
          }
          exceptionBuilder_.setMessage(value);
        }
        infoCase_ = 5;
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public Builder clearException() {
        if (exceptionBuilder_ == null) {
          if (infoCase_ == 5) {
            infoCase_ = 0;
            info_ = null;
            onChanged();
          }
        } else {
          if (infoCase_ == 5) {
            infoCase_ = 0;
            info_ = null;
          }
          exceptionBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder getExceptionBuilder() {
        return getExceptionFieldBuilder().getBuilder();
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      public com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder getExceptionOrBuilder() {
        if ((infoCase_ == 5) && (exceptionBuilder_ != null)) {
          return exceptionBuilder_.getMessageOrBuilder();
        } else {
          if (infoCase_ == 5) {
            return (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_;
          }
          return com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
        }
      }
      /**
       * <code>.com.github.kornilova_l.protos.Event.Exception exception = 5;</code>
       */
      private com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
          com.github.kornilova_l.protos.EventProtos.Event.Exception, com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder, com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder>
          getExceptionFieldBuilder() {
        if (exceptionBuilder_ == null) {
          if (!(infoCase_ == 5)) {
            info_ = com.github.kornilova_l.protos.EventProtos.Event.Exception.getDefaultInstance();
          }
          exceptionBuilder_ = new com.github.kornilova_l.libs.com.google.protobuf.SingleFieldBuilderV3<
              com.github.kornilova_l.protos.EventProtos.Event.Exception, com.github.kornilova_l.protos.EventProtos.Event.Exception.Builder, com.github.kornilova_l.protos.EventProtos.Event.ExceptionOrBuilder>(
                  (com.github.kornilova_l.protos.EventProtos.Event.Exception) info_,
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        infoCase_ = 5;
        onChanged();;
        return exceptionBuilder_;
      }
      public final Builder setUnknownFields(
          final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.github.kornilova_l.libs.com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.github.kornilova_l.protos.Event)
    }

    // @@protoc_insertion_point(class_scope:com.github.kornilova_l.protos.Event)
    private static final com.github.kornilova_l.protos.EventProtos.Event DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.github.kornilova_l.protos.EventProtos.Event();
    }

    public static com.github.kornilova_l.protos.EventProtos.Event getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.github.kornilova_l.libs.com.google.protobuf.Parser<Event>
        PARSER = new com.github.kornilova_l.libs.com.google.protobuf.AbstractParser<Event>() {
      public Event parsePartialFrom(
          com.github.kornilova_l.libs.com.google.protobuf.CodedInputStream input,
          com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.github.kornilova_l.libs.com.google.protobuf.InvalidProtocolBufferException {
          return new Event(input, extensionRegistry);
      }
    };

    public static com.github.kornilova_l.libs.com.google.protobuf.Parser<Event> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.github.kornilova_l.libs.com.google.protobuf.Parser<Event> getParserForType() {
      return PARSER;
    }

    public com.github.kornilova_l.protos.EventProtos.Event getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_kornilova_l_protos_src_Event_descriptor;
  private static final
    com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_kornilova_l_protos_src_Event_fieldAccessorTable;
  private static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_kornilova_l_protos_src_Event_Enter_descriptor;
  private static final
    com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_kornilova_l_protos_src_Event_Enter_fieldAccessorTable;
  private static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_kornilova_l_protos_src_Event_Exit_descriptor;
  private static final
    com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_kornilova_l_protos_src_Event_Exit_fieldAccessorTable;
  private static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_kornilova_l_protos_src_Event_Exception_descriptor;
  private static final
    com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_kornilova_l_protos_src_Event_Exception_fieldAccessorTable;
  private static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_kornilova_l_protos_src_Event_Var_descriptor;
  private static final
    com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_kornilova_l_protos_src_Event_Var_fieldAccessorTable;
  private static final com.github.kornilova_l.libs.com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_kornilova_l_protos_src_Event_Object_descriptor;
  private static final
    com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_kornilova_l_protos_src_Event_Object_fieldAccessorTable;

  public static com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-com/github/kornilova_l/protos/src/even" +
      "t.proto\022!com.github.kornilova_l.protos.s" +
      "rc\"\376\005\n\005Event\022\021\n\tthread_id\030\001 \001(\003\022\014\n\004time\030" +
      "\002 \001(\003\022?\n\005enter\030\003 \001(\0132..com.github.kornil" +
      "ova_l.protos.src.Event.EnterH\000\022=\n\004exit\030\004" +
      " \001(\0132-.com.github.kornilova_l.protos.src" +
      ".Event.ExitH\000\022G\n\texception\030\005 \001(\01322.com.g" +
      "ithub.kornilova_l.protos.src.Event.Excep" +
      "tionH\000\032\205\001\n\005Enter\022\022\n\nclass_name\030\001 \001(\t\022\023\n\013" +
      "method_name\030\002 \001(\t\022\021\n\tis_static\030\003 \001(\010\022@\n\n",
      "parameters\030\004 \003(\0132,.com.github.kornilova_" +
      "l.protos.src.Event.Var\032J\n\004Exit\022B\n\014return" +
      "_value\030\001 \001(\0132,.com.github.kornilova_l.pr" +
      "otos.src.Event.Var\032L\n\tException\022?\n\006objec" +
      "t\030\001 \001(\0132/.com.github.kornilova_l.protos." +
      "src.Event.Object\032\271\001\n\003Var\022\013\n\001I\030\001 \001(\021H\000\022\013\n" +
      "\001J\030\002 \001(\022H\000\022\013\n\001Z\030\003 \001(\010H\000\022\013\n\001C\030\004 \001(\rH\000\022\013\n\001" +
      "S\030\005 \001(\021H\000\022\013\n\001B\030\006 \001(\021H\000\022\013\n\001F\030\007 \001(\002H\000\022\013\n\001D" +
      "\030\010 \001(\001H\000\022A\n\006object\030\t \001(\0132/.com.github.ko" +
      "rnilova_l.protos.src.Event.ObjectH\000B\007\n\005v",
      "alue\032%\n\006Object\022\014\n\004type\030\001 \001(\t\022\r\n\005value\030\002 " +
      "\001(\tB\006\n\004infoB\rB\013EventProtosb\006proto3"
    };
    com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.github.kornilova_l.libs.com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.github.kornilova_l.libs.com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_github_kornilova_l_protos_src_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_kornilova_l_protos_src_Event_fieldAccessorTable = new
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_kornilova_l_protos_src_Event_descriptor,
        new java.lang.String[] { "ThreadId", "Time", "Enter", "Exit", "Exception", "Info", });
    internal_static_com_github_kornilova_l_protos_src_Event_Enter_descriptor =
      internal_static_com_github_kornilova_l_protos_src_Event_descriptor.getNestedTypes().get(0);
    internal_static_com_github_kornilova_l_protos_src_Event_Enter_fieldAccessorTable = new
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_kornilova_l_protos_src_Event_Enter_descriptor,
        new java.lang.String[] { "ClassName", "MethodName", "IsStatic", "Parameters", });
    internal_static_com_github_kornilova_l_protos_src_Event_Exit_descriptor =
      internal_static_com_github_kornilova_l_protos_src_Event_descriptor.getNestedTypes().get(1);
    internal_static_com_github_kornilova_l_protos_src_Event_Exit_fieldAccessorTable = new
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_kornilova_l_protos_src_Event_Exit_descriptor,
        new java.lang.String[] { "ReturnValue", });
    internal_static_com_github_kornilova_l_protos_src_Event_Exception_descriptor =
      internal_static_com_github_kornilova_l_protos_src_Event_descriptor.getNestedTypes().get(2);
    internal_static_com_github_kornilova_l_protos_src_Event_Exception_fieldAccessorTable = new
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_kornilova_l_protos_src_Event_Exception_descriptor,
        new java.lang.String[] { "Object", });
    internal_static_com_github_kornilova_l_protos_src_Event_Var_descriptor =
      internal_static_com_github_kornilova_l_protos_src_Event_descriptor.getNestedTypes().get(3);
    internal_static_com_github_kornilova_l_protos_src_Event_Var_fieldAccessorTable = new
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_kornilova_l_protos_src_Event_Var_descriptor,
        new java.lang.String[] { "I", "J", "Z", "C", "S", "B", "F", "D", "Object", "Value", });
    internal_static_com_github_kornilova_l_protos_src_Event_Object_descriptor =
      internal_static_com_github_kornilova_l_protos_src_Event_descriptor.getNestedTypes().get(4);
    internal_static_com_github_kornilova_l_protos_src_Event_Object_fieldAccessorTable = new
      com.github.kornilova_l.libs.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_kornilova_l_protos_src_Event_Object_descriptor,
        new java.lang.String[] { "Type", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
