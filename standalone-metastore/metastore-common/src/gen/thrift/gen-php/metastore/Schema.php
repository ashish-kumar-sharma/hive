<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class Schema
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'fieldSchemas',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\FieldSchema',
                ),
        ),
        2 => array(
            'var' => 'properties',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var \metastore\FieldSchema[]
     */
    public $fieldSchemas = null;
    /**
     * @var array
     */
    public $properties = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['fieldSchemas'])) {
                $this->fieldSchemas = $vals['fieldSchemas'];
            }
            if (isset($vals['properties'])) {
                $this->properties = $vals['properties'];
            }
        }
    }

    public function getName()
    {
        return 'Schema';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->fieldSchemas = array();
                        $_size329 = 0;
                        $_etype332 = 0;
                        $xfer += $input->readListBegin($_etype332, $_size329);
                        for ($_i333 = 0; $_i333 < $_size329; ++$_i333) {
                            $elem334 = null;
                            $elem334 = new \metastore\FieldSchema();
                            $xfer += $elem334->read($input);
                            $this->fieldSchemas []= $elem334;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::MAP) {
                        $this->properties = array();
                        $_size335 = 0;
                        $_ktype336 = 0;
                        $_vtype337 = 0;
                        $xfer += $input->readMapBegin($_ktype336, $_vtype337, $_size335);
                        for ($_i339 = 0; $_i339 < $_size335; ++$_i339) {
                            $key340 = '';
                            $val341 = '';
                            $xfer += $input->readString($key340);
                            $xfer += $input->readString($val341);
                            $this->properties[$key340] = $val341;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('Schema');
        if ($this->fieldSchemas !== null) {
            if (!is_array($this->fieldSchemas)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('fieldSchemas', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->fieldSchemas));
            foreach ($this->fieldSchemas as $iter342) {
                $xfer += $iter342->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->properties !== null) {
            if (!is_array($this->properties)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('properties', TType::MAP, 2);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->properties));
            foreach ($this->properties as $kiter343 => $viter344) {
                $xfer += $output->writeString($kiter343);
                $xfer += $output->writeString($viter344);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
