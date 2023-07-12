package mensagem;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mensagem.proto

public final class MensagemProtocolBuffers {
  private MensagemProtocolBuffers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MensagemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Mensagem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 tipo = 1;</code>
     * @return The tipo.
     */
    int getTipo();

    /**
     * <code>int32 codOperacao = 2;</code>
     * @return The codOperacao.
     */
    int getCodOperacao();

    /**
     * <code>int32 idMensagem = 3;</code>
     * @return The idMensagem.
     */
    int getIdMensagem();

    /**
     * <code>string nomeUsuarioOrigem = 4;</code>
     * @return The nomeUsuarioOrigem.
     */
    java.lang.String getNomeUsuarioOrigem();
    /**
     * <code>string nomeUsuarioOrigem = 4;</code>
     * @return The bytes for nomeUsuarioOrigem.
     */
    com.google.protobuf.ByteString
        getNomeUsuarioOrigemBytes();

    /**
     * <code>repeated string parametros = 5;</code>
     * @return A list containing the parametros.
     */
    java.util.List<java.lang.String>
        getParametrosList();
    /**
     * <code>repeated string parametros = 5;</code>
     * @return The count of parametros.
     */
    int getParametrosCount();
    /**
     * <code>repeated string parametros = 5;</code>
     * @param index The index of the element to return.
     * @return The parametros at the given index.
     */
    java.lang.String getParametros(int index);
    /**
     * <code>repeated string parametros = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the parametros at the given index.
     */
    com.google.protobuf.ByteString
        getParametrosBytes(int index);
  }
  /**
   * Protobuf type {@code Mensagem}
   */
  public static final class Mensagem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Mensagem)
      MensagemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mensagem.newBuilder() to construct.
    private Mensagem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mensagem() {
      nomeUsuarioOrigem_ = "";
      parametros_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Mensagem();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MensagemProtocolBuffers.internal_static_Mensagem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MensagemProtocolBuffers.internal_static_Mensagem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MensagemProtocolBuffers.Mensagem.class, MensagemProtocolBuffers.Mensagem.Builder.class);
    }

    public static final int TIPO_FIELD_NUMBER = 1;
    private int tipo_ = 0;
    /**
     * <code>int32 tipo = 1;</code>
     * @return The tipo.
     */
    @java.lang.Override
    public int getTipo() {
      return tipo_;
    }

    public static final int CODOPERACAO_FIELD_NUMBER = 2;
    private int codOperacao_ = 0;
    /**
     * <code>int32 codOperacao = 2;</code>
     * @return The codOperacao.
     */
    @java.lang.Override
    public int getCodOperacao() {
      return codOperacao_;
    }

    public static final int IDMENSAGEM_FIELD_NUMBER = 3;
    private int idMensagem_ = 0;
    /**
     * <code>int32 idMensagem = 3;</code>
     * @return The idMensagem.
     */
    @java.lang.Override
    public int getIdMensagem() {
      return idMensagem_;
    }

    public static final int NOMEUSUARIOORIGEM_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nomeUsuarioOrigem_ = "";
    /**
     * <code>string nomeUsuarioOrigem = 4;</code>
     * @return The nomeUsuarioOrigem.
     */
    @java.lang.Override
    public java.lang.String getNomeUsuarioOrigem() {
      java.lang.Object ref = nomeUsuarioOrigem_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nomeUsuarioOrigem_ = s;
        return s;
      }
    }
    /**
     * <code>string nomeUsuarioOrigem = 4;</code>
     * @return The bytes for nomeUsuarioOrigem.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNomeUsuarioOrigemBytes() {
      java.lang.Object ref = nomeUsuarioOrigem_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nomeUsuarioOrigem_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMETROS_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList parametros_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string parametros = 5;</code>
     * @return A list containing the parametros.
     */
    public com.google.protobuf.ProtocolStringList
        getParametrosList() {
      return parametros_;
    }
    /**
     * <code>repeated string parametros = 5;</code>
     * @return The count of parametros.
     */
    public int getParametrosCount() {
      return parametros_.size();
    }
    /**
     * <code>repeated string parametros = 5;</code>
     * @param index The index of the element to return.
     * @return The parametros at the given index.
     */
    public java.lang.String getParametros(int index) {
      return parametros_.get(index);
    }
    /**
     * <code>repeated string parametros = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the parametros at the given index.
     */
    public com.google.protobuf.ByteString
        getParametrosBytes(int index) {
      return parametros_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (tipo_ != 0) {
        output.writeInt32(1, tipo_);
      }
      if (codOperacao_ != 0) {
        output.writeInt32(2, codOperacao_);
      }
      if (idMensagem_ != 0) {
        output.writeInt32(3, idMensagem_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nomeUsuarioOrigem_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nomeUsuarioOrigem_);
      }
      for (int i = 0; i < parametros_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, parametros_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tipo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, tipo_);
      }
      if (codOperacao_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, codOperacao_);
      }
      if (idMensagem_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, idMensagem_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nomeUsuarioOrigem_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nomeUsuarioOrigem_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < parametros_.size(); i++) {
          dataSize += computeStringSizeNoTag(parametros_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getParametrosList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof MensagemProtocolBuffers.Mensagem)) {
        return super.equals(obj);
      }
      MensagemProtocolBuffers.Mensagem other = (MensagemProtocolBuffers.Mensagem) obj;

      if (getTipo()
          != other.getTipo()) return false;
      if (getCodOperacao()
          != other.getCodOperacao()) return false;
      if (getIdMensagem()
          != other.getIdMensagem()) return false;
      if (!getNomeUsuarioOrigem()
          .equals(other.getNomeUsuarioOrigem())) return false;
      if (!getParametrosList()
          .equals(other.getParametrosList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIPO_FIELD_NUMBER;
      hash = (53 * hash) + getTipo();
      hash = (37 * hash) + CODOPERACAO_FIELD_NUMBER;
      hash = (53 * hash) + getCodOperacao();
      hash = (37 * hash) + IDMENSAGEM_FIELD_NUMBER;
      hash = (53 * hash) + getIdMensagem();
      hash = (37 * hash) + NOMEUSUARIOORIGEM_FIELD_NUMBER;
      hash = (53 * hash) + getNomeUsuarioOrigem().hashCode();
      if (getParametrosCount() > 0) {
        hash = (37 * hash) + PARAMETROS_FIELD_NUMBER;
        hash = (53 * hash) + getParametrosList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MensagemProtocolBuffers.Mensagem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static MensagemProtocolBuffers.Mensagem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static MensagemProtocolBuffers.Mensagem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MensagemProtocolBuffers.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(MensagemProtocolBuffers.Mensagem prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Mensagem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Mensagem)
        MensagemProtocolBuffers.MensagemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MensagemProtocolBuffers.internal_static_Mensagem_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MensagemProtocolBuffers.internal_static_Mensagem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MensagemProtocolBuffers.Mensagem.class, MensagemProtocolBuffers.Mensagem.Builder.class);
      }

      // Construct using MensagemOuterClass.Mensagem.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        tipo_ = 0;
        codOperacao_ = 0;
        idMensagem_ = 0;
        nomeUsuarioOrigem_ = "";
        parametros_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MensagemProtocolBuffers.internal_static_Mensagem_descriptor;
      }

      @java.lang.Override
      public MensagemProtocolBuffers.Mensagem getDefaultInstanceForType() {
        return MensagemProtocolBuffers.Mensagem.getDefaultInstance();
      }

      @java.lang.Override
      public MensagemProtocolBuffers.Mensagem build() {
        MensagemProtocolBuffers.Mensagem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MensagemProtocolBuffers.Mensagem buildPartial() {
        MensagemProtocolBuffers.Mensagem result = new MensagemProtocolBuffers.Mensagem(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(MensagemProtocolBuffers.Mensagem result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.tipo_ = tipo_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.codOperacao_ = codOperacao_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.idMensagem_ = idMensagem_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.nomeUsuarioOrigem_ = nomeUsuarioOrigem_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          parametros_.makeImmutable();
          result.parametros_ = parametros_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MensagemProtocolBuffers.Mensagem) {
          return mergeFrom((MensagemProtocolBuffers.Mensagem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MensagemProtocolBuffers.Mensagem other) {
        if (other == MensagemProtocolBuffers.Mensagem.getDefaultInstance()) return this;
        if (other.getTipo() != 0) {
          setTipo(other.getTipo());
        }
        if (other.getCodOperacao() != 0) {
          setCodOperacao(other.getCodOperacao());
        }
        if (other.getIdMensagem() != 0) {
          setIdMensagem(other.getIdMensagem());
        }
        if (!other.getNomeUsuarioOrigem().isEmpty()) {
          nomeUsuarioOrigem_ = other.nomeUsuarioOrigem_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        if (!other.parametros_.isEmpty()) {
          if (parametros_.isEmpty()) {
            parametros_ = other.parametros_;
            bitField0_ |= 0x00000010;
          } else {
            ensureParametrosIsMutable();
            parametros_.addAll(other.parametros_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                tipo_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                codOperacao_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                idMensagem_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                nomeUsuarioOrigem_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 42: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureParametrosIsMutable();
                parametros_.add(s);
                break;
              } // case 42
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int tipo_ ;
      /**
       * <code>int32 tipo = 1;</code>
       * @return The tipo.
       */
      @java.lang.Override
      public int getTipo() {
        return tipo_;
      }
      /**
       * <code>int32 tipo = 1;</code>
       * @param value The tipo to set.
       * @return This builder for chaining.
       */
      public Builder setTipo(int value) {

        tipo_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 tipo = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTipo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tipo_ = 0;
        onChanged();
        return this;
      }

      private int codOperacao_ ;
      /**
       * <code>int32 codOperacao = 2;</code>
       * @return The codOperacao.
       */
      @java.lang.Override
      public int getCodOperacao() {
        return codOperacao_;
      }
      /**
       * <code>int32 codOperacao = 2;</code>
       * @param value The codOperacao to set.
       * @return This builder for chaining.
       */
      public Builder setCodOperacao(int value) {

        codOperacao_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 codOperacao = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodOperacao() {
        bitField0_ = (bitField0_ & ~0x00000002);
        codOperacao_ = 0;
        onChanged();
        return this;
      }

      private int idMensagem_ ;
      /**
       * <code>int32 idMensagem = 3;</code>
       * @return The idMensagem.
       */
      @java.lang.Override
      public int getIdMensagem() {
        return idMensagem_;
      }
      /**
       * <code>int32 idMensagem = 3;</code>
       * @param value The idMensagem to set.
       * @return This builder for chaining.
       */
      public Builder setIdMensagem(int value) {

        idMensagem_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 idMensagem = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIdMensagem() {
        bitField0_ = (bitField0_ & ~0x00000004);
        idMensagem_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object nomeUsuarioOrigem_ = "";
      /**
       * <code>string nomeUsuarioOrigem = 4;</code>
       * @return The nomeUsuarioOrigem.
       */
      public java.lang.String getNomeUsuarioOrigem() {
        java.lang.Object ref = nomeUsuarioOrigem_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nomeUsuarioOrigem_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nomeUsuarioOrigem = 4;</code>
       * @return The bytes for nomeUsuarioOrigem.
       */
      public com.google.protobuf.ByteString
          getNomeUsuarioOrigemBytes() {
        java.lang.Object ref = nomeUsuarioOrigem_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nomeUsuarioOrigem_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nomeUsuarioOrigem = 4;</code>
       * @param value The nomeUsuarioOrigem to set.
       * @return This builder for chaining.
       */
      public Builder setNomeUsuarioOrigem(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nomeUsuarioOrigem_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string nomeUsuarioOrigem = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNomeUsuarioOrigem() {
        nomeUsuarioOrigem_ = getDefaultInstance().getNomeUsuarioOrigem();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string nomeUsuarioOrigem = 4;</code>
       * @param value The bytes for nomeUsuarioOrigem to set.
       * @return This builder for chaining.
       */
      public Builder setNomeUsuarioOrigemBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nomeUsuarioOrigem_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList parametros_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureParametrosIsMutable() {
        if (!parametros_.isModifiable()) {
          parametros_ = new com.google.protobuf.LazyStringArrayList(parametros_);
        }
        bitField0_ |= 0x00000010;
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @return A list containing the parametros.
       */
      public com.google.protobuf.ProtocolStringList
          getParametrosList() {
        parametros_.makeImmutable();
        return parametros_;
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @return The count of parametros.
       */
      public int getParametrosCount() {
        return parametros_.size();
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @param index The index of the element to return.
       * @return The parametros at the given index.
       */
      public java.lang.String getParametros(int index) {
        return parametros_.get(index);
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the parametros at the given index.
       */
      public com.google.protobuf.ByteString
          getParametrosBytes(int index) {
        return parametros_.getByteString(index);
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @param index The index to set the value at.
       * @param value The parametros to set.
       * @return This builder for chaining.
       */
      public Builder setParametros(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureParametrosIsMutable();
        parametros_.set(index, value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @param value The parametros to add.
       * @return This builder for chaining.
       */
      public Builder addParametros(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureParametrosIsMutable();
        parametros_.add(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @param values The parametros to add.
       * @return This builder for chaining.
       */
      public Builder addAllParametros(
          java.lang.Iterable<java.lang.String> values) {
        ensureParametrosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parametros_);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearParametros() {
        parametros_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string parametros = 5;</code>
       * @param value The bytes of the parametros to add.
       * @return This builder for chaining.
       */
      public Builder addParametrosBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureParametrosIsMutable();
        parametros_.add(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Mensagem)
    }

    // @@protoc_insertion_point(class_scope:Mensagem)
    private static final MensagemProtocolBuffers.Mensagem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MensagemProtocolBuffers.Mensagem();
    }

    public static MensagemProtocolBuffers.Mensagem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Mensagem>
        PARSER = new com.google.protobuf.AbstractParser<Mensagem>() {
      @java.lang.Override
      public Mensagem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Mensagem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Mensagem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MensagemProtocolBuffers.Mensagem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Mensagem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Mensagem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016mensagem.proto\"p\n\010Mensagem\022\014\n\004tipo\030\001 \001" +
      "(\005\022\023\n\013codOperacao\030\002 \001(\005\022\022\n\nidMensagem\030\003 " +
      "\001(\005\022\031\n\021nomeUsuarioOrigem\030\004 \001(\t\022\022\n\nparame" +
      "tros\030\005 \003(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Mensagem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Mensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Mensagem_descriptor,
        new java.lang.String[] { "Tipo", "CodOperacao", "IdMensagem", "NomeUsuarioOrigem", "Parametros", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
