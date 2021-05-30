<?php
/**
 * Autogenerated by Thrift Compiler (0.14.1)
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

class TBinaryColumn
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'values',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        2 => array(
            'var' => 'nulls',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string[]
     */
    public $values = null;
    /**
     * @var string
     */
    public $nulls = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['values'])) {
                $this->values = $vals['values'];
            }
            if (isset($vals['nulls'])) {
                $this->nulls = $vals['nulls'];
            }
        }
    }

    public function getName()
    {
        return 'TBinaryColumn';
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
                        $this->values = array();
                        $_size97 = 0;
                        $_etype100 = 0;
                        $xfer += $input->readListBegin($_etype100, $_size97);
                        for ($_i101 = 0; $_i101 < $_size97; ++$_i101) {
                            $elem102 = null;
                            $xfer += $input->readString($elem102);
                            $this->values []= $elem102;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->nulls);
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
        $xfer += $output->writeStructBegin('TBinaryColumn');
        if ($this->values !== null) {
            if (!is_array($this->values)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('values', TType::LST, 1);
            $output->writeListBegin(TType::STRING, count($this->values));
            foreach ($this->values as $iter103) {
                $xfer += $output->writeString($iter103);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->nulls !== null) {
            $xfer += $output->writeFieldBegin('nulls', TType::STRING, 2);
            $xfer += $output->writeString($this->nulls);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
